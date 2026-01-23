package com.robinhood.android.equityscreener.indicators;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.Focusable2;
import androidx.compose.foundation.Hoverable2;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemantics;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.Shadow3;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.graphics.PointMode;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.PointerType;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.util.MathHelpers;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.robinhood.android.equityscreener.indicators.RangeSlider2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: RangeSlider.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001aU\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001b\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001fH\u0003¢\u0006\u0004\b\"\u0010#\u001a=\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010'\u001a6\u0010(\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002\u001a2\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0082@¢\u0006\u0004\b4\u00105\u001a0\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002\u001a \u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0002\u001a \u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0002\u001aE\u0010C\u001a\u00020\u00012\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060E2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060H2\u0006\u0010I\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010J\u001aP\u0010K\u001a\u00020\u0003*\u00020\u00032\u0006\u0010I\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0002\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\r\u001a\u00020MH\u0002\u001a\u0098\u0001\u0010N\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00060P2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010R\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00062\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010E0P2\u001e\u0010T\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000f0PH\u0002\u001a^\u0010`\u001a\u0004\u0018\u00010.*\u00020/2\u0006\u0010a\u001a\u0002012\u0006\u0010b\u001a\u00020326\u0010c\u001a2\u0012\u0013\u0012\u00110.¢\u0006\f\bd\u0012\b\be\u0012\u0004\b\b(f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bd\u0012\b\be\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020\u00010\u000fH\u0080@¢\u0006\u0004\bh\u0010i\u001aT\u0010j\u001a\u0004\u0018\u00010.*\u00020/2\u0006\u0010a\u001a\u0002012\u0006\u0010b\u001a\u0002032\u0018\u0010c\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\u00060EH\u0082H¢\u0006\u0004\bm\u0010n\u001a\u001b\u0010r\u001a\u00020\f*\u00020s2\u0006\u0010a\u001a\u000201H\u0002¢\u0006\u0004\bt\u0010u\u001a\u001b\u0010v\u001a\u00020\u0006*\u00020w2\u0006\u0010b\u001a\u000203H\u0000¢\u0006\u0004\bx\u0010y\"\u000e\u0010\u0011\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010U\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010W\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010X\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010Y\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010Z\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010[\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010\\\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u000e\u0010]\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060_X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010o\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u0010\u0010p\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010V\"\u000e\u0010q\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006z"}, m3636d2 = {"RangeSlider", "", "modifier", "Landroidx/compose/ui/Modifier;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "selectedLow", "selectedHigh", "sliderAlgorithm", "Lcom/robinhood/android/equityscreener/indicators/RangeSliderAlgorithm;", "enabled", "", "steps", "onValueChange", "Lkotlin/Function2;", "(Landroidx/compose/ui/Modifier;Lkotlin/ranges/ClosedFloatingPointRange;FFLcom/robinhood/android/equityscreener/indicators/RangeSliderAlgorithm;ZFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Exponent", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "width", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFFFLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", "offset", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "thumbSize", "SliderThumb-9PgDwT0", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;ZFLandroidx/compose/runtime/Composer;I)V", "Track", "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;ZFFFFLandroidx/compose/runtime/Composer;I)V", "snapValueToStep", "current", "minPx", "maxPx", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scale", "inMin", "inMax", "position", "outMin", "outMax", "lerp", "startValue", "endValue", "fraction", "calcFraction", "start", "end", "CorrectValueSideEffect", "scaleToOffset", "Lkotlin/Function1;", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", "value", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "valueRange", "", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "ThumbRadius", "F", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "TrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "awaitHorizontalPointerSlopOrCancellation", "pointerId", "pointerType", "onPointerSlopReached", "Lkotlin/ParameterName;", "name", "change", "overSlop", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "feature-equity-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RangeSlider2 {
    private static final Modifier DefaultSliderConstraints;
    public static final float Exponent = 2.0f;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius;
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;
    private static final float ThumbRippleRadius = C2002Dp.m7995constructorimpl(24);
    private static final float ThumbDefaultElevation = C2002Dp.m7995constructorimpl(1);
    private static final float ThumbPressedElevation = C2002Dp.m7995constructorimpl(6);
    private static final float TrackHeight = C2002Dp.m7995constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CorrectValueSideEffect$lambda$17(Function1 function1, Ranges3 ranges3, SnapshotState snapshotState, float f, int i, Composer composer, int i2) {
        CorrectValueSideEffect(function1, ranges3, snapshotState, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$3(Modifier modifier, Ranges3 ranges3, float f, float f2, RangeSlider rangeSlider, boolean z, float f3, Function2 function2, int i, int i2, Composer composer, int i3) {
        RangeSlider(modifier, ranges3, f, f2, rangeSlider, z, f3, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$6(boolean z, float f, float f2, float f3, InteractionSource3 interactionSource3, InteractionSource3 interactionSource32, Modifier modifier, Modifier modifier2, Modifier modifier3, int i, Composer composer, int i2) {
        RangeSliderImpl(z, f, f2, f3, interactionSource3, interactionSource32, modifier, modifier2, modifier3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SliderThumb_9PgDwT0$lambda$10(BoxScope boxScope, Modifier modifier, float f, InteractionSource3 interactionSource3, boolean z, float f2, int i, Composer composer, int i2) {
        m13978SliderThumb9PgDwT0(boxScope, modifier, f, interactionSource3, z, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track$lambda$13(Modifier modifier, boolean z, float f, float f2, float f3, float f4, int i, Composer composer, int i2) {
        Track(modifier, z, f, f2, f3, f4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(Modifier modifier, Ranges3<Float> ranges3, float f, float f2, RangeSlider rangeSlider, boolean z, float f3, final Function2<? super Boolean, ? super Ranges3<Float>, Unit> onValueChange, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Ranges3<Float> ranges3RangeTo;
        float f4;
        float f5;
        int i4;
        int i5;
        boolean z2;
        int i6;
        float f6;
        RangeSlider rangeSlider2;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean z3;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier4;
        final RangeSlider rangeSlider3;
        final Ranges3<Float> ranges32;
        final float f7;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(132073245);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                ranges3RangeTo = ranges3;
                int i8 = composerStartRestartGroup.changed(ranges3RangeTo) ? 32 : 16;
                i3 |= i8;
            } else {
                ranges3RangeTo = ranges3;
            }
            i3 |= i8;
        } else {
            ranges3RangeTo = ranges3;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                f4 = f;
                i3 |= composerStartRestartGroup.changed(f4) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                if ((i & 3072) == 0) {
                    f5 = f2;
                    i3 |= composerStartRestartGroup.changed(f5) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(rangeSlider == null ? -1 : rangeSlider.ordinal()) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f6 = f3;
                } else {
                    f6 = f3;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(f6) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            ranges3RangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        rangeSlider2 = i4 == 0 ? RangeSlider.LINEAR : rangeSlider;
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i6 == 0) {
                            modifier3 = modifier5;
                            f6 = 10.0f;
                        } else {
                            modifier3 = modifier5;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        rangeSlider2 = rangeSlider;
                        modifier3 = modifier2;
                    }
                    boolean z5 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(132073245, i3, -1, "com.robinhood.android.equityscreener.indicators.RangeSlider (RangeSlider.kt:105)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z3 = ((i3 & 896) != 256) | ((i3 & 7168) == 2048);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(RangesKt.rangeTo(f, f2), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i3 >> 21) & 14);
                    float f8 = ThumbRadius;
                    RangeSlider rangeSlider4 = rangeSlider2;
                    Ranges3<Float> ranges33 = ranges3RangeTo;
                    float f9 = f6;
                    BoxWithConstraints.BoxWithConstraints(SizeKt.m5165requiredSizeInqDBjuR0$default(modifier3, C2002Dp.m7995constructorimpl(4 * f8), C2002Dp.m7995constructorimpl(f8 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambda3.rememberComposableLambda(-2128155661, true, new C157291(rangeSlider4, ranges33, (SnapshotState) objRememberedValue3, f9, snapshotState4RememberUpdatedState, interactionSource3, interactionSource32, z5), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier3;
                    rangeSlider3 = rangeSlider4;
                    ranges32 = ranges33;
                    f7 = f9;
                    z4 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    ranges32 = ranges3RangeTo;
                    f7 = f6;
                    z4 = z2;
                    rangeSlider3 = rangeSlider;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final float f10 = f4;
                    final float f11 = f5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RangeSlider2.RangeSlider$lambda$3(modifier4, ranges32, f10, f11, rangeSlider3, z4, f7, onValueChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            f5 = f2;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    boolean z52 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    InteractionSource3 interactionSource33 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    InteractionSource3 interactionSource322 = (InteractionSource3) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z3 = ((i3 & 896) != 256) | ((i3 & 7168) == 2048);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(RangesKt.rangeTo(f, f2), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i3 >> 21) & 14);
                        float f82 = ThumbRadius;
                        RangeSlider rangeSlider42 = rangeSlider2;
                        Ranges3<Float> ranges332 = ranges3RangeTo;
                        float f92 = f6;
                        BoxWithConstraints.BoxWithConstraints(SizeKt.m5165requiredSizeInqDBjuR0$default(modifier3, C2002Dp.m7995constructorimpl(4 * f82), C2002Dp.m7995constructorimpl(f82 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambda3.rememberComposableLambda(-2128155661, true, new C157291(rangeSlider42, ranges332, (SnapshotState) objRememberedValue3, f92, snapshotState4RememberUpdatedState2, interactionSource33, interactionSource322, z52), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier3;
                        rangeSlider3 = rangeSlider42;
                        ranges32 = ranges332;
                        f7 = f92;
                        z4 = z52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f4 = f;
        if ((i2 & 8) != 0) {
        }
        f5 = f2;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    static {
        float f = 18;
        ThumbRadius = C2002Dp.m7995constructorimpl(f);
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(48);
        SliderHeight = fM7995constructorimpl;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(144);
        SliderMinWidth = fM7995constructorimpl2;
        DefaultSliderConstraints = SizeKt.m5158heightInVpY3zN4$default(SizeKt.m5176widthInVpY3zN4$default(Modifier.INSTANCE, fM7995constructorimpl2, 0.0f, 2, null), 0.0f, fM7995constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
        float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl((float) 0.125d);
        mouseSlop = fM7995constructorimpl3;
        float fM7995constructorimpl4 = C2002Dp.m7995constructorimpl(f);
        defaultTouchSlop = fM7995constructorimpl4;
        mouseToTouchSlopRatio = fM7995constructorimpl3 / fM7995constructorimpl4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSlider$onValueChangeState(SnapshotState<Ranges3<Float>> snapshotState, SnapshotState4<? extends Function2<? super Boolean, ? super Ranges3<Float>, Unit>> snapshotState4, boolean z, Ranges3<Float> ranges3) {
        if (ranges3 == null) {
            ranges3 = snapshotState.getValue();
        }
        snapshotState.setValue(ranges3);
        snapshotState4.getValue().invoke(Boolean.valueOf(z), snapshotState.getValue());
    }

    /* compiled from: RangeSlider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1 */
    static final class C157291 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Ranges3<Float>> $currentRange;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InteractionSource3 $endInteractionSource;
        final /* synthetic */ SnapshotState4<Function2<Boolean, Ranges3<Float>, Unit>> $onValueChangeState;
        final /* synthetic */ Ranges3<Float> $range;
        final /* synthetic */ RangeSlider $sliderAlgorithm;
        final /* synthetic */ InteractionSource3 $startInteractionSource;
        final /* synthetic */ float $steps;

        /* JADX WARN: Multi-variable type inference failed */
        C157291(RangeSlider rangeSlider, Ranges3<Float> ranges3, SnapshotState<Ranges3<Float>> snapshotState, float f, SnapshotState4<? extends Function2<? super Boolean, ? super Ranges3<Float>, Unit>> snapshotState4, InteractionSource3 interactionSource3, InteractionSource3 interactionSource32, boolean z) {
            this.$sliderAlgorithm = rangeSlider;
            this.$range = ranges3;
            this.$currentRange = snapshotState;
            this.$steps = f;
            this.$onValueChangeState = snapshotState4;
            this.$startInteractionSource = interactionSource3;
            this.$endInteractionSource = interactionSource32;
            this.$enabled = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final float invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, RangeSlider rangeSlider, Ranges3<Float> ranges3, float f) {
            float f2 = floatRef.element;
            float f3 = floatRef2.element;
            float f4 = f2 - f3;
            float fFloatValue = (rangeSlider.getTo().invoke(Float.valueOf(f - f3)).floatValue() / rangeSlider.getTo().invoke(Float.valueOf(f4)).floatValue()) * f4;
            float f5 = floatRef2.element;
            return RangeSlider2.scale(f5, floatRef.element, fFloatValue + f5, ranges3.getStart().floatValue(), ranges3.getEndInclusive().floatValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ranges3<Float> invoke$scaleToUserValue$2(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, RangeSlider rangeSlider, Ranges3<Float> ranges3, Ranges3<Float> ranges32) {
            return RangesKt.rangeTo(invoke$scaleToUserValue(floatRef, floatRef2, rangeSlider, ranges3, ranges32.getStart().floatValue()), invoke$scaleToUserValue(floatRef, floatRef2, rangeSlider, ranges3, ranges32.getEndInclusive().floatValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(RangeSlider rangeSlider, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ranges3<Float> ranges3, float f) {
            float fFloatValue = rangeSlider.getFrom().invoke(Float.valueOf(f)).floatValue();
            Ranges3<Float> ranges3RangeTo = RangesKt.rangeTo(rangeSlider.getFrom().invoke(ranges3.getStart()).floatValue(), rangeSlider.getFrom().invoke(ranges3.getEndInclusive()).floatValue());
            return RangeSlider2.scale(ranges3RangeTo.getStart().floatValue(), ranges3RangeTo.getEndInclusive().floatValue(), fFloatValue, floatRef.element, floatRef2.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ranges3 ranges3, float f, CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState4 snapshotState4, RangeSlider rangeSlider, boolean z) {
            float fCoerceIn;
            float floatValue = (z ? snapshotFloatState2 : snapshotFloatState22).getFloatValue();
            if (z) {
                fCoerceIn = RangesKt.coerceIn(snapshotFloatState2.getFloatValue(), floatRef.element, snapshotFloatState22.getFloatValue());
            } else {
                fCoerceIn = RangesKt.coerceIn(snapshotFloatState22.getFloatValue(), snapshotFloatState2.getFloatValue(), floatRef2.element);
            }
            float fSnapValueToStep = RangeSlider2.snapValueToStep(ranges3, fCoerceIn, f, floatRef.element, floatRef2.element);
            if (floatValue == fSnapValueToStep) {
                RangeSlider2.RangeSlider$onValueChangeState(snapshotState, snapshotState4, true, null);
                return Unit.INSTANCE;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RangeSlider5(floatValue, fSnapValueToStep, z, snapshotFloatState2, snapshotFloatState22, floatRef2, floatRef, rangeSlider, ranges3, snapshotState, snapshotState4, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit invoke$lambda$11$lambda$10(SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, RangeSlider rangeSlider, Ranges3 ranges3, SnapshotState4 snapshotState4, boolean z, float f) {
            Ranges3<Float> ranges3RangeTo;
            if (z) {
                snapshotFloatState2.setFloatValue(snapshotFloatState2.getFloatValue() + f);
                snapshotFloatState22.setFloatValue(invoke$scaleToOffset(rangeSlider, floatRef, floatRef2, ranges3, ((Number) ((Ranges3) snapshotState.getValue()).getEndInclusive()).floatValue()));
                float floatValue = snapshotFloatState22.getFloatValue();
                ranges3RangeTo = RangesKt.rangeTo(RangesKt.coerceIn(snapshotFloatState2.getFloatValue(), floatRef.element, floatValue), floatValue);
            } else {
                snapshotFloatState22.setFloatValue(snapshotFloatState22.getFloatValue() + f);
                snapshotFloatState2.setFloatValue(invoke$scaleToOffset(rangeSlider, floatRef, floatRef2, ranges3, ((Number) ((Ranges3) snapshotState.getValue()).getStart()).floatValue()));
                float floatValue2 = snapshotFloatState2.getFloatValue();
                ranges3RangeTo = RangesKt.rangeTo(floatValue2, RangesKt.coerceIn(snapshotFloatState22.getFloatValue(), floatValue2, floatRef2.element));
            }
            RangeSlider2.RangeSlider$onValueChangeState(snapshotState, snapshotState4, false, invoke$scaleToUserValue$2(floatRef2, floatRef, rangeSlider, ranges3, ranges3RangeTo));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(float f, SnapshotState snapshotState, SnapshotState4 snapshotState4, boolean z, float f2) {
            RangeSlider2.RangeSlider$onValueChangeState(snapshotState, snapshotState4, z, RangesKt.rangeTo(f2, f));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$14(float f, SnapshotState snapshotState, SnapshotState4 snapshotState4, boolean z, float f2) {
            RangeSlider2.RangeSlider$onValueChangeState(snapshotState, snapshotState4, z, RangesKt.rangeTo(f, f2));
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            int i2;
            Ref.FloatRef floatRef;
            Ref.FloatRef floatRef2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2128155661, i2, -1, "com.robinhood.android.equityscreener.indicators.RangeSlider.<anonymous> (RangeSlider.kt:120)");
            }
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float fM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(BoxWithConstraints.getConstraints());
            final Ref.FloatRef floatRef3 = new Ref.FloatRef();
            final Ref.FloatRef floatRef4 = new Ref.FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            floatRef3.element = fM7975getMaxWidthimpl - density.mo5016toPx0680j_4(RangeSlider2.ThumbRadius);
            floatRef4.element = density.mo5016toPx0680j_4(RangeSlider2.ThumbRadius);
            composer.startReplaceGroup(1849434622);
            SnapshotState<Ranges3<Float>> snapshotState = this.$currentRange;
            RangeSlider rangeSlider = this.$sliderAlgorithm;
            Ranges3<Float> ranges3 = this.$range;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(invoke$scaleToOffset(rangeSlider, floatRef4, floatRef3, ranges3, snapshotState.getValue().getStart().floatValue()));
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            SnapshotState<Ranges3<Float>> snapshotState2 = this.$currentRange;
            RangeSlider rangeSlider2 = this.$sliderAlgorithm;
            Ranges3<Float> ranges32 = this.$range;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(invoke$scaleToOffset(rangeSlider2, floatRef4, floatRef3, ranges32, snapshotState2.getValue().getEndInclusive().floatValue()));
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$sliderAlgorithm.ordinal()) | composer.changed(this.$range) | composer.changed(floatRef4.element) | composer.changed(floatRef3.element);
            RangeSlider rangeSlider3 = this.$sliderAlgorithm;
            Ranges3<Float> ranges33 = this.$range;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new RangeSlider3(rangeSlider3, floatRef4, floatRef3, ranges33);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            RangeSlider2.CorrectValueSideEffect((Function1) ((KFunction) objRememberedValue3), RangesKt.rangeTo(floatRef4.element, floatRef3.element), snapshotFloatState2, this.$currentRange.getValue().getStart().floatValue(), composer, 384);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged2 = composer.changed(this.$sliderAlgorithm.ordinal()) | composer.changed(this.$range) | composer.changed(floatRef4.element) | composer.changed(floatRef3.element);
            RangeSlider rangeSlider4 = this.$sliderAlgorithm;
            Ranges3<Float> ranges34 = this.$range;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new RangeSlider4(rangeSlider4, floatRef4, floatRef3, ranges34);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            RangeSlider2.CorrectValueSideEffect((Function1) ((KFunction) objRememberedValue4), RangesKt.rangeTo(floatRef4.element, floatRef3.element), snapshotFloatState22, this.$currentRange.getValue().getEndInclusive().floatValue(), composer, 384);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                composer.updateRememberedValue(objRememberedValue5);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue5;
            composer.startReplaceGroup(-1224400529);
            boolean zChanged3 = composer.changed(floatRef4.element) | composer.changed(floatRef3.element) | composer.changed(this.$range) | composer.changed(this.$steps) | composer.changed(this.$currentRange) | composer.changed(this.$onValueChangeState) | composer.changedInstance(coroutineScope) | composer.changed(this.$sliderAlgorithm.ordinal());
            final Ranges3<Float> ranges35 = this.$range;
            final float f = this.$steps;
            final SnapshotState<Ranges3<Float>> snapshotState3 = this.$currentRange;
            final SnapshotState4<Function2<Boolean, Ranges3<Float>, Unit>> snapshotState4 = this.$onValueChangeState;
            final RangeSlider rangeSlider5 = this.$sliderAlgorithm;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RangeSlider2.C157291.invoke$lambda$9$lambda$8(snapshotFloatState2, snapshotFloatState22, floatRef4, floatRef3, ranges35, f, coroutineScope, snapshotState3, snapshotState4, rangeSlider5, ((Boolean) obj).booleanValue());
                    }
                };
                floatRef = floatRef4;
                floatRef2 = floatRef3;
                composer.updateRememberedValue(objRememberedValue6);
            } else {
                floatRef2 = floatRef3;
                floatRef = floatRef4;
            }
            composer.endReplaceGroup();
            SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState((Function1) objRememberedValue6, composer, 0);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged4 = composer.changed(this.$sliderAlgorithm.ordinal()) | composer.changed(this.$range) | composer.changed(floatRef.element) | composer.changed(floatRef2.element) | composer.changed(this.$currentRange) | composer.changed(this.$onValueChangeState);
            final SnapshotState<Ranges3<Float>> snapshotState5 = this.$currentRange;
            final RangeSlider rangeSlider6 = this.$sliderAlgorithm;
            final Ranges3<Float> ranges36 = this.$range;
            final SnapshotState4<Function2<Boolean, Ranges3<Float>, Unit>> snapshotState42 = this.$onValueChangeState;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue7 == companion.getEmpty()) {
                final Ref.FloatRef floatRef5 = floatRef2;
                final Ref.FloatRef floatRef6 = floatRef;
                objRememberedValue7 = new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RangeSlider2.C157291.invoke$lambda$11$lambda$10(snapshotFloatState2, snapshotFloatState22, snapshotState5, floatRef6, floatRef5, rangeSlider6, ranges36, snapshotState42, ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState((Function2) objRememberedValue7, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierRangeSliderPressDragModifier = RangeSlider2.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, snapshotFloatState2, snapshotFloatState22, this.$enabled, z, fM7975getMaxWidthimpl, this.$range, snapshotState4RememberUpdatedState, snapshotState4RememberUpdatedState2);
            final float floatValue = snapshotFloatState2.getFloatValue();
            final float floatValue2 = snapshotFloatState22.getFloatValue();
            float fCalcFraction = RangeSlider2.calcFraction(floatRef.element, floatRef2.element, floatValue);
            float fCalcFraction2 = RangeSlider2.calcFraction(floatRef.element, floatRef2.element, floatValue2);
            RangeSlider rangeSlider7 = this.$sliderAlgorithm;
            Ranges3<Float> ranges37 = this.$range;
            float fInvoke$scaleToOffset = invoke$scaleToOffset(rangeSlider7, floatRef, floatRef2, ranges37, ranges37.getStart().floatValue());
            boolean z2 = this.$enabled;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged5 = composer.changed(this.$currentRange) | composer.changed(this.$onValueChangeState) | composer.changed(floatValue2);
            final SnapshotState<Ranges3<Float>> snapshotState6 = this.$currentRange;
            final SnapshotState4<Function2<Boolean, Ranges3<Float>, Unit>> snapshotState43 = this.$onValueChangeState;
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RangeSlider2.C157291.invoke$lambda$13$lambda$12(floatValue2, snapshotState6, snapshotState43, ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            Modifier modifierSliderSemantics = RangeSlider2.sliderSemantics(companion2, floatValue, z2, (Function2) objRememberedValue8, RangesKt.rangeTo(fInvoke$scaleToOffset, RangesKt.coerceAtLeast(floatValue2, fInvoke$scaleToOffset)), (int) this.$steps);
            RangeSlider rangeSlider8 = this.$sliderAlgorithm;
            Ranges3<Float> ranges38 = this.$range;
            float fInvoke$scaleToOffset2 = invoke$scaleToOffset(rangeSlider8, floatRef, floatRef2, ranges38, ranges38.getEndInclusive().floatValue());
            boolean z3 = this.$enabled;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged6 = composer.changed(this.$currentRange) | composer.changed(this.$onValueChangeState) | composer.changed(floatValue);
            final SnapshotState<Ranges3<Float>> snapshotState7 = this.$currentRange;
            final SnapshotState4<Function2<Boolean, Ranges3<Float>, Unit>> snapshotState44 = this.$onValueChangeState;
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RangeSlider2.C157291.invoke$lambda$15$lambda$14(floatValue, snapshotState7, snapshotState44, ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceGroup();
            RangeSlider2.RangeSliderImpl(this.$enabled, fCalcFraction, fCalcFraction2, floatRef2.element - floatRef.element, this.$startInteractionSource, this.$endInteractionSource, modifierRangeSliderPressDragModifier, modifierSliderSemantics, RangeSlider2.sliderSemantics(companion2, floatValue2, z3, (Function2) objRememberedValue9, RangesKt.rangeTo(RangesKt.coerceAtMost(floatValue, fInvoke$scaleToOffset2), fInvoke$scaleToOffset2), (int) this.$steps), composer, 221184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl(final boolean z, final float f, final float f2, final float f3, final InteractionSource3 interactionSource3, final InteractionSource3 interactionSource32, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1758545013);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(interactionSource3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(interactionSource32) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier3) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((38347923 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1758545013, i3, -1, "com.robinhood.android.equityscreener.indicators.RangeSliderImpl (RangeSlider.kt:288)");
            }
            Modifier modifierThen = modifier.then(DefaultSliderConstraints);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(TrackHeight);
            float f4 = ThumbRadius;
            float fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(f4);
            float fMo5012toDpu2uoSUM = density.mo5012toDpu2uoSUM(f3);
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f4 * 2);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(fMo5012toDpu2uoSUM * f);
            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(fMo5012toDpu2uoSUM * f2);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion3, companion.getCenterStart()), 0.0f, 1, null), z, f, f2, fMo5016toPx0680j_42, fMo5016toPx0680j_4, composerStartRestartGroup, (i3 << 3) & 8176);
            int i4 = (i3 << 12) & 57344;
            m13978SliderThumb9PgDwT0(boxScopeInstance, Focusable2.focusable(companion3, true, interactionSource3).then(modifier2), fM7995constructorimpl2, interactionSource3, z, fM7995constructorimpl, composerStartRestartGroup, 196614 | ((i3 >> 3) & 7168) | i4);
            m13978SliderThumb9PgDwT0(boxScopeInstance, Focusable2.focusable(companion3, true, interactionSource32).then(modifier3), fM7995constructorimpl3, interactionSource32, z, fM7995constructorimpl, composerStartRestartGroup, 196614 | ((i3 >> 6) & 7168) | i4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RangeSlider2.RangeSliderImpl$lambda$6(z, f, f2, f3, interactionSource3, interactionSource32, modifier, modifier2, modifier3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: SliderThumb-9PgDwT0, reason: not valid java name */
    private static final void m13978SliderThumb9PgDwT0(final BoxScope boxScope, final Modifier modifier, final float f, final InteractionSource3 interactionSource3, final boolean z, final float f2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-924917800);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(interactionSource3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-924917800, i2, -1, "com.robinhood.android.equityscreener.indicators.SliderThumb (RangeSlider.kt:341)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM5146paddingqDBjuR0$default, companion.getCenterStart());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = (i2 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new RangeSlider6(interactionSource3, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(interactionSource3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i2 >> 9) & 14);
            float fM7995constructorimpl = !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation;
            Modifier modifierClip = Clip.clip(SizeKt.m5169size3ABfNKs(modifier, f2), RoundedCornerShape2.getCircleShape());
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(2);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierHoverable$default = Hoverable2.hoverable$default(IndicationKt.indication(BorderKt.m4876borderxT4_qwU(modifierClip, fM7995constructorimpl2, bentoTheme.getColors(composerStartRestartGroup, i3).getPrime(), RoundedCornerShape2.getCircleShape()), interactionSource3, RippleKt.m5937rippleH2RKhps$default(false, ThumbRippleRadius, 0L, 4, null)), interactionSource3, false, 2, null);
            if (!z) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            }
            Spacer2.Spacer(Background3.m4872backgroundbw27NRU$default(Shadow3.m6468shadows4CzXII$default(modifierHoverable$default, fM7995constructorimpl, RoundedCornerShape2.getCircleShape(), false, 0L, 0L, 24, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RangeSlider2.SliderThumb_9PgDwT0$lambda$10(boxScope, modifier, f, interactionSource3, z, f2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Track(final Modifier modifier, final boolean z, final float f, final float f2, final float f3, final float f4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1271592742);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271592742, i2, -1, "com.robinhood.android.equityscreener.indicators.Track (RangeSlider.kt:390)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            final long jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU();
            composerStartRestartGroup.startReplaceGroup(2065063126);
            long prime = z ? bentoTheme.getColors(composerStartRestartGroup, i3).getPrime() : jM21373getBg30d7_KjU;
            composerStartRestartGroup.endReplaceGroup();
            final long jM21373getBg30d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU();
            composerStartRestartGroup.startReplaceGroup(2065067509);
            long prime2 = z ? bentoTheme.getColors(composerStartRestartGroup, i3).getPrime() : jM21373getBg30d7_KjU2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = ((57344 & i2) == 16384) | composerStartRestartGroup.changed(jM21373getBg30d7_KjU) | ((458752 & i2) == 131072) | ((i2 & 7168) == 2048);
            boolean z2 = (i2 & 896) == 256;
            final long j = prime;
            int i4 = i2;
            final long j2 = prime2;
            boolean zChanged2 = zChanged | z2 | composerStartRestartGroup.changed(j) | composerStartRestartGroup.changed(jM21373getBg30d7_KjU2) | composerStartRestartGroup.changed(j2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RangeSlider2.Track$lambda$12$lambda$11(f3, jM21373getBg30d7_KjU, f4, f2, f, j, jM21373getBg30d7_KjU2, j2, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, i4 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RangeSlider2.Track$lambda$13(modifier, z, f, f2, f3, f4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track$lambda$12$lambda$11(float f, long j, float f2, float f3, float f4, long j2, long j3, long j4, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        boolean z = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - f;
        long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long j5 = jM6535constructorimpl2;
        if (!z) {
            jM6535constructorimpl2 = jM6535constructorimpl;
        }
        if (z) {
            j5 = jM6535constructorimpl;
        }
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j, jM6535constructorimpl2, j5, f2, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        int i = (int) (jM6535constructorimpl2 >> 32);
        int i2 = (int) (j5 >> 32);
        long jM6535constructorimpl3 = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i) + ((Float.intBitsToFloat(i2) - Float.intBitsToFloat(i)) * f3)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) + ((Float.intBitsToFloat(i2) - Float.intBitsToFloat(i)) * f4);
        long j6 = j5;
        long j7 = jM6535constructorimpl2;
        DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j2, Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), jM6535constructorimpl3, f2, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        Offset offsetM6534boximpl = Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L)));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (OffsetKt.m6554lerpWko1d7g(j7, j6, f4) >> 32));
        List listListOf = CollectionsKt.listOf((Object[]) new Offset[]{offsetM6534boximpl, Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)))});
        PointMode.Companion companion2 = PointMode.INSTANCE;
        DrawScope.m6956drawPointsF8ZwMP8$default(Canvas, listListOf, companion2.m6819getLinesr_lszbg(), j3, f2, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        Offset offsetM6534boximpl2 = Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (OffsetKt.m6554lerpWko1d7g(j7, j6, f4) >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L)));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (OffsetKt.m6554lerpWko1d7g(j7, j6, f3) >> 32));
        DrawScope.m6956drawPointsF8ZwMP8$default(Canvas, CollectionsKt.listOf((Object[]) new Offset[]{offsetM6534boximpl2, Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32)))}), companion2.m6819getLinesr_lszbg(), j4, f2, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (OffsetKt.m6554lerpWko1d7g(j7, j6, f3) >> 32));
        Offset offsetM6534boximpl3 = Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat5) << 32)));
        float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
        DrawScope.m6956drawPointsF8ZwMP8$default(Canvas, CollectionsKt.listOf((Object[]) new Offset[]{offsetM6534boximpl3, Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat6) << 32)))}), companion2.m6819getLinesr_lszbg(), j3, f2, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToStep(Ranges3<Float> ranges3, float f, float f2, float f3, float f4) {
        float fFloatValue = ((f4 - f3) * f2) / (ranges3.getEndInclusive().floatValue() - ranges3.getStart().floatValue());
        BigDecimal bigDecimalRemainder = new BigDecimal(String.valueOf(f)).remainder(new BigDecimal(String.valueOf(fFloatValue)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalRemainder, "remainder(...)");
        if (bigDecimalRemainder.floatValue() > fFloatValue / 2) {
            return f + (fFloatValue - bigDecimalRemainder.floatValue());
        }
        return f - bigDecimalRemainder.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m13982awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Tuples2<PointerInputChange, Float>> continuation) {
        RangeSlider8 rangeSlider8;
        Ref.FloatRef floatRef;
        if (continuation instanceof RangeSlider8) {
            rangeSlider8 = (RangeSlider8) continuation;
            int i2 = rangeSlider8.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rangeSlider8.label = i2 - Integer.MIN_VALUE;
            } else {
                rangeSlider8 = new RangeSlider8(continuation);
            }
        }
        RangeSlider8 rangeSlider82 = rangeSlider8;
        Object obj = rangeSlider82.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = rangeSlider82.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2 function2 = new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RangeSlider2.awaitSlop_8vUncbI$lambda$14(floatRef2, (PointerInputChange) obj2, ((Float) obj3).floatValue());
                }
            };
            rangeSlider82.L$0 = floatRef2;
            rangeSlider82.label = 1;
            Object objM13980awaitHorizontalPointerSlopOrCancellationgDDlDlE = m13980awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, rangeSlider82);
            if (objM13980awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM13980awaitHorizontalPointerSlopOrCancellationgDDlDlE;
            floatRef = floatRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) rangeSlider82.L$0;
            ResultKt.throwOnFailure(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            return Tuples4.m3642to(pointerInputChange, boxing.boxFloat(floatRef.element));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit awaitSlop_8vUncbI$lambda$14(Ref.FloatRef floatRef, PointerInputChange pointerInput, float f) {
        Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
        pointerInput.consume();
        floatRef.element = f;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CorrectValueSideEffect(final Function1<? super Float, Float> function1, final Ranges3<Float> ranges3, final SnapshotState<Float> snapshotState, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1770167986);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(ranges3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(snapshotState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770167986, i2, -1, "com.robinhood.android.equityscreener.indicators.CorrectValueSideEffect (RangeSlider.kt:510)");
            }
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean z = ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RangeSlider2.CorrectValueSideEffect$lambda$16$lambda$15(function1, f, ranges3, snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RangeSlider2.CorrectValueSideEffect$lambda$17(function1, ranges3, snapshotState, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CorrectValueSideEffect$lambda$16$lambda$15(Function1 function1, float f, Ranges3 ranges3, SnapshotState snapshotState) {
        float fFloatValue = ((Number) function1.invoke(Float.valueOf(f))).floatValue();
        if (ranges3.contains((Comparable) snapshotState.getValue()) && ranges3.contains(Float.valueOf(fFloatValue))) {
            snapshotState.setValue(Float.valueOf(fFloatValue));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, boolean z, Function2 function2, Ranges3 ranges3, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            ranges3 = RangesKt.rangeTo(0.0f, 1.0f);
        }
        Ranges3 ranges32 = ranges3;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        return sliderSemantics(modifier, f, z, function2, ranges32, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f, final boolean z, final Function2<? super Boolean, ? super Float, Unit> function2, final Ranges3<Float> ranges3, final int i) {
        final float fCoerceIn = RangesKt.coerceIn(f, ranges3.getStart().floatValue(), ranges3.getEndInclusive().floatValue());
        return ProgressSemantics.progressSemantics(SemanticsModifier6.semantics$default(modifier, false, new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RangeSlider2.sliderSemantics$lambda$19(z, ranges3, i, fCoerceIn, function2, (SemanticsPropertyReceiver) obj);
            }
        }, 1, null), f, ranges3, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sliderSemantics$lambda$19(boolean z, final Ranges3 ranges3, final int i, final float f, final Function2 function2, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (!z) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(RangeSlider2.sliderSemantics$lambda$19$lambda$18(ranges3, i, f, function2, ((Float) obj).floatValue()));
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean sliderSemantics$lambda$19$lambda$18(Ranges3 ranges3, int i, float f, Function2 function2, float f2) {
        float fCoerceIn = RangesKt.coerceIn(f2, ((Number) ranges3.getStart()).floatValue(), ((Number) ranges3.getEndInclusive()).floatValue());
        if (i > 0 && i >= 0) {
            float fAbs = fCoerceIn;
            float f3 = fAbs;
            int i2 = 0;
            while (true) {
                float fLerp = MathHelpers.lerp(((Number) ranges3.getStart()).floatValue(), ((Number) ranges3.getEndInclusive()).floatValue(), i2 / (i + 1));
                float f4 = fLerp - fCoerceIn;
                if (Math.abs(f4) <= fAbs) {
                    fAbs = Math.abs(f4);
                    f3 = fLerp;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
            fCoerceIn = f3;
        }
        if (fCoerceIn == f) {
            function2.invoke(Boolean.TRUE, Float.valueOf(f2));
            return false;
        }
        function2.invoke(Boolean.FALSE, Float.valueOf(fCoerceIn));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, final InteractionSource3 interactionSource3, final InteractionSource3 interactionSource32, final SnapshotState4<Float> snapshotState4, final SnapshotState4<Float> snapshotState42, boolean z, final boolean z2, final float f, Ranges3<Float> ranges3, final SnapshotState4<? extends Function1<? super Boolean, Unit>> snapshotState43, final SnapshotState4<? extends Function2<? super Boolean, ? super Float, Unit>> snapshotState44) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{interactionSource3, interactionSource32, Float.valueOf(f), Boolean.valueOf(z2), ranges3}, new PointerInputEventHandler() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt.rangeSliderPressDragModifier.1
            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objCoroutineScope = CoroutineScope2.coroutineScope(new AnonymousClass1(pointerInputScope, z2, f, new RangeSlider9(interactionSource3, interactionSource32, snapshotState4, snapshotState42, snapshotState44), snapshotState4, snapshotState43, snapshotState42, snapshotState44, null), continuation);
                return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
            }

            /* compiled from: RangeSlider.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1", m3645f = "RangeSlider.kt", m3646l = {587}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ SnapshotState4<Function1<Boolean, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ SnapshotState4<Function2<Boolean, Float, Unit>> $onDrag;
                final /* synthetic */ RangeSlider9 $rangeSliderLogic;
                final /* synthetic */ SnapshotState4<Float> $rawOffsetEnd;
                final /* synthetic */ SnapshotState4<Float> $rawOffsetStart;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(PointerInputScope pointerInputScope, boolean z, float f, RangeSlider9 rangeSlider9, SnapshotState4<Float> snapshotState4, SnapshotState4<? extends Function1<? super Boolean, Unit>> snapshotState42, SnapshotState4<Float> snapshotState43, SnapshotState4<? extends Function2<? super Boolean, ? super Float, Unit>> snapshotState44, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$this_pointerInput = pointerInputScope;
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$rangeSliderLogic = rangeSlider9;
                    this.$rawOffsetStart = snapshotState4;
                    this.$gestureEndAction = snapshotState42;
                    this.$rawOffsetEnd = snapshotState43;
                    this.$onDrag = snapshotState44;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: RangeSlider.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1$1", m3645f = "RangeSlider.kt", m3646l = {588}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499821 extends ContinuationImpl7 implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CoroutineScope $$this$coroutineScope;
                    final /* synthetic */ SnapshotState4<Function1<Boolean, Unit>> $gestureEndAction;
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ SnapshotState4<Function2<Boolean, Float, Unit>> $onDrag;
                    final /* synthetic */ RangeSlider9 $rangeSliderLogic;
                    final /* synthetic */ SnapshotState4<Float> $rawOffsetEnd;
                    final /* synthetic */ SnapshotState4<Float> $rawOffsetStart;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C499821(boolean z, float f, RangeSlider9 rangeSlider9, SnapshotState4<Float> snapshotState4, CoroutineScope coroutineScope, SnapshotState4<? extends Function1<? super Boolean, Unit>> snapshotState42, SnapshotState4<Float> snapshotState43, SnapshotState4<? extends Function2<? super Boolean, ? super Float, Unit>> snapshotState44, Continuation<? super C499821> continuation) {
                        super(2, continuation);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$rangeSliderLogic = rangeSlider9;
                        this.$rawOffsetStart = snapshotState4;
                        this.$$this$coroutineScope = coroutineScope;
                        this.$gestureEndAction = snapshotState42;
                        this.$rawOffsetEnd = snapshotState43;
                        this.$onDrag = snapshotState44;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499821 c499821 = new C499821(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                        c499821.L$0 = obj;
                        return c499821;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        return ((C499821) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: RangeSlider.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1$1$1", m3645f = "RangeSlider.kt", m3646l = {589, 599, 618}, m3647m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C499831 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        final /* synthetic */ SnapshotState4<Function1<Boolean, Unit>> $gestureEndAction;
                        final /* synthetic */ boolean $isRtl;
                        final /* synthetic */ float $maxPx;
                        final /* synthetic */ SnapshotState4<Function2<Boolean, Float, Unit>> $onDrag;
                        final /* synthetic */ RangeSlider9 $rangeSliderLogic;
                        final /* synthetic */ SnapshotState4<Float> $rawOffsetEnd;
                        final /* synthetic */ SnapshotState4<Float> $rawOffsetStart;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C499831(boolean z, float f, RangeSlider9 rangeSlider9, SnapshotState4<Float> snapshotState4, CoroutineScope coroutineScope, SnapshotState4<? extends Function1<? super Boolean, Unit>> snapshotState42, SnapshotState4<Float> snapshotState43, SnapshotState4<? extends Function2<? super Boolean, ? super Float, Unit>> snapshotState44, Continuation<? super C499831> continuation) {
                            super(2, continuation);
                            this.$isRtl = z;
                            this.$maxPx = f;
                            this.$rangeSliderLogic = rangeSlider9;
                            this.$rawOffsetStart = snapshotState4;
                            this.$$this$coroutineScope = coroutineScope;
                            this.$gestureEndAction = snapshotState42;
                            this.$rawOffsetEnd = snapshotState43;
                            this.$onDrag = snapshotState44;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C499831 c499831 = new C499831(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                            c499831.L$0 = obj;
                            return c499831;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                            return ((C499831) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:52:0x017d, code lost:
                        
                            if (r1 != r6) goto L54;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            AwaitPointerEventScope awaitPointerEventScope;
                            Object objAwaitFirstDown$default;
                            Ref.FloatRef floatRef;
                            Object objM13982awaitSlop8vUncbI;
                            AwaitPointerEventScope awaitPointerEventScope2;
                            PointerInputChange pointerInputChange;
                            DragInteraction.Start start;
                            final Ref.BooleanRef booleanRef;
                            Tuples2 tuples2;
                            DragInteraction.Start start2;
                            Object objM4980horizontalDragjO51t88;
                            DragInteraction cancel;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                this.L$0 = awaitPointerEventScope;
                                this.label = 1;
                                objAwaitFirstDown$default = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                                if (objAwaitFirstDown$default != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            if (i == 1) {
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                objAwaitFirstDown$default = obj;
                            } else {
                                if (i != 2) {
                                    if (i != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    booleanRef = (Ref.BooleanRef) this.L$1;
                                    start2 = (DragInteraction.Start) this.L$0;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        start = start2;
                                        objM4980horizontalDragjO51t88 = obj;
                                        if (((Boolean) objM4980horizontalDragjO51t88).booleanValue()) {
                                            cancel = new DragInteraction.Stop(start);
                                        } else {
                                            cancel = new DragInteraction.Cancel(start);
                                        }
                                    } catch (CancellationException unused) {
                                        cancel = new DragInteraction.Cancel(start2);
                                        this.$gestureEndAction.getValue().invoke(boxing.boxBoolean(booleanRef.element));
                                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef, cancel, null), 3, null);
                                        return Unit.INSTANCE;
                                    }
                                    this.$gestureEndAction.getValue().invoke(boxing.boxBoolean(booleanRef.element));
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef, cancel, null), 3, null);
                                    return Unit.INSTANCE;
                                }
                                booleanRef = (Ref.BooleanRef) this.L$4;
                                floatRef = (Ref.FloatRef) this.L$3;
                                DragInteraction.Start start3 = (DragInteraction.Start) this.L$2;
                                PointerInputChange pointerInputChange2 = (PointerInputChange) this.L$1;
                                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                pointerInputChange = pointerInputChange2;
                                start = start3;
                                objM13982awaitSlop8vUncbI = obj;
                                tuples2 = (Tuples2) objM13982awaitSlop8vUncbI;
                                if (tuples2 != null) {
                                    SnapshotState4<Float> snapshotState4 = this.$rawOffsetEnd;
                                    SnapshotState4<Float> snapshotState42 = this.$rawOffsetStart;
                                    boolean z = this.$isRtl;
                                    float fM13984pointerSlopE8SPZFQ = RangeSlider2.m13984pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                                    if (Math.abs(snapshotState4.getValue().floatValue() - floatRef.element) < fM13984pointerSlopE8SPZFQ && Math.abs(snapshotState42.getValue().floatValue() - floatRef.element) < fM13984pointerSlopE8SPZFQ) {
                                        float fFloatValue = ((Number) tuples2.getSecond()).floatValue();
                                        booleanRef.element = !z ? fFloatValue >= 0.0f : fFloatValue < 0.0f;
                                        floatRef.element += Float.intBitsToFloat((int) (PointerEventKt.positionChange((PointerInputChange) tuples2.getFirst()) >> 32));
                                    }
                                }
                                this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                                try {
                                    long id = pointerInputChange.getId();
                                    final SnapshotState4<Function2<Boolean, Float, Unit>> snapshotState43 = this.$onDrag;
                                    final boolean z2 = this.$isRtl;
                                    Function1 function1 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return RangeSlider2.C157311.AnonymousClass1.C499821.C499831.invokeSuspend$lambda$1(snapshotState43, booleanRef, z2, (PointerInputChange) obj2);
                                        }
                                    };
                                    this.L$0 = start;
                                    this.L$1 = booleanRef;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.label = 3;
                                    objM4980horizontalDragjO51t88 = DragGestureDetectorKt.m4980horizontalDragjO51t88(awaitPointerEventScope2, id, function1, this);
                                } catch (CancellationException unused2) {
                                    start2 = start;
                                    cancel = new DragInteraction.Cancel(start2);
                                    this.$gestureEndAction.getValue().invoke(boxing.boxBoolean(booleanRef.element));
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef, cancel, null), 3, null);
                                    return Unit.INSTANCE;
                                }
                            }
                            AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope;
                            PointerInputChange pointerInputChange3 = (PointerInputChange) objAwaitFirstDown$default;
                            DragInteraction.Start start4 = new DragInteraction.Start();
                            floatRef = new Ref.FloatRef();
                            float fIntBitsToFloat = this.$isRtl ? this.$maxPx - Float.intBitsToFloat((int) (pointerInputChange3.getPosition() >> 32)) : Float.intBitsToFloat((int) (pointerInputChange3.getPosition() >> 32));
                            floatRef.element = fIntBitsToFloat;
                            int iCompareOffsets = this.$rangeSliderLogic.compareOffsets(fIntBitsToFloat);
                            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                            booleanRef2.element = iCompareOffsets == 0 ? this.$rawOffsetStart.getValue().floatValue() > floatRef.element : iCompareOffsets < 0;
                            long id2 = pointerInputChange3.getId();
                            int type2 = pointerInputChange3.getType();
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = pointerInputChange3;
                            this.L$2 = start4;
                            this.L$3 = floatRef;
                            this.L$4 = booleanRef2;
                            this.label = 2;
                            objM13982awaitSlop8vUncbI = RangeSlider2.m13982awaitSlop8vUncbI(awaitPointerEventScope4, id2, type2, this);
                            if (objM13982awaitSlop8vUncbI != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                pointerInputChange = pointerInputChange3;
                                start = start4;
                                booleanRef = booleanRef2;
                                tuples2 = (Tuples2) objM13982awaitSlop8vUncbI;
                                if (tuples2 != null) {
                                }
                                this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                                long id3 = pointerInputChange.getId();
                                final SnapshotState4 snapshotState432 = this.$onDrag;
                                final boolean z22 = this.$isRtl;
                                Function1 function12 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return RangeSlider2.C157311.AnonymousClass1.C499821.C499831.invokeSuspend$lambda$1(snapshotState432, booleanRef, z22, (PointerInputChange) obj2);
                                    }
                                };
                                this.L$0 = start;
                                this.L$1 = booleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                objM4980horizontalDragjO51t88 = DragGestureDetectorKt.m4980horizontalDragjO51t88(awaitPointerEventScope2, id3, function12, this);
                            }
                            return coroutine_suspended;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invokeSuspend$lambda$1(SnapshotState4 snapshotState4, Ref.BooleanRef booleanRef, boolean z, PointerInputChange pointerInputChange) {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) >> 32));
                            Function2 function2 = (Function2) snapshotState4.getValue();
                            Boolean boolValueOf = Boolean.valueOf(booleanRef.element);
                            if (z) {
                                fIntBitsToFloat = -fIntBitsToFloat;
                            }
                            function2.invoke(boolValueOf, Float.valueOf(fIntBitsToFloat));
                            return Unit.INSTANCE;
                        }

                        /* compiled from: RangeSlider.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1$1$1$2", m3645f = "RangeSlider.kt", m3646l = {635}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Ref.BooleanRef $draggingStart;
                            final /* synthetic */ DragInteraction $finishInteraction;
                            final /* synthetic */ RangeSlider9 $rangeSliderLogic;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass2(RangeSlider9 rangeSlider9, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super AnonymousClass2> continuation) {
                                super(2, continuation);
                                this.$rangeSliderLogic = rangeSlider9;
                                this.$draggingStart = booleanRef;
                                this.$finishInteraction = dragInteraction;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    InteractionSource3 interactionSource3ActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                                    DragInteraction dragInteraction = this.$finishInteraction;
                                    this.label = 1;
                                    if (interactionSource3ActiveInteraction.emit(dragInteraction, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                            C499831 c499831 = new C499831(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                            this.label = 1;
                            if (pointerInputScope.awaitPointerEventScope(c499831, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C499821 c499821 = new C499821(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                        this.label = 1;
                        if (ForEachGesture.forEachGesture(pointerInputScope, c499821, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }) : modifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0124 -> B:48:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x016c -> B:55:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0189 -> B:48:0x012c). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m13980awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        RangeSlider7 rangeSlider7;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        RangeSlider7 rangeSlider72;
        float f;
        float fIntBitsToFloat;
        Ref.LongRef longRef2;
        RangeSlider7 rangeSlider73;
        float f2;
        float f3;
        Iterator<T> it;
        PointerEventPass pointerEventPass;
        Object next;
        PointerInputChange pointerInputChange;
        Object next2;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof RangeSlider7) {
            rangeSlider7 = (RangeSlider7) continuation;
            int i2 = rangeSlider7.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rangeSlider7.label = i2 - Integer.MIN_VALUE;
            } else {
                rangeSlider7 = new RangeSlider7(continuation);
            }
        }
        Object obj = rangeSlider7.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = rangeSlider7.label;
        int i4 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (m13983isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                return null;
            }
            float fM13984pointerSlopE8SPZFQ = m13984pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = j;
            awaitPointerEventScope2 = awaitPointerEventScope;
            function22 = function2;
            longRef = longRef3;
            rangeSlider72 = rangeSlider7;
            f = fM13984pointerSlopE8SPZFQ;
            fIntBitsToFloat = 0.0f;
            rangeSlider72.L$0 = function22;
            rangeSlider72.L$1 = awaitPointerEventScope2;
            rangeSlider72.L$2 = longRef;
            rangeSlider72.L$3 = pointerEventPass2;
            rangeSlider72.F$0 = f;
            rangeSlider72.F$1 = fIntBitsToFloat;
            rangeSlider72.label = i4;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, rangeSlider72, i4, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f4 = rangeSlider7.F$1;
            float f5 = rangeSlider7.F$0;
            PointerInputChange pointerInputChange2 = (PointerInputChange) rangeSlider7.L$3;
            Ref.LongRef longRef4 = (Ref.LongRef) rangeSlider7.L$2;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) rangeSlider7.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) rangeSlider7.L$0;
            ResultKt.throwOnFailure(obj);
            fIntBitsToFloat = f4;
            pointerEventPass = null;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            longRef2 = longRef4;
            rangeSlider73 = rangeSlider7;
            f = f5;
            function22 = function23;
            if (pointerInputChange2.isConsumed()) {
                return pointerEventPass;
            }
            rangeSlider72 = rangeSlider73;
            longRef = longRef2;
            pointerEventPass2 = pointerEventPass;
            i4 = 1;
            rangeSlider72.L$0 = function22;
            rangeSlider72.L$1 = awaitPointerEventScope2;
            rangeSlider72.L$2 = longRef;
            rangeSlider72.L$3 = pointerEventPass2;
            rangeSlider72.F$0 = f;
            rangeSlider72.F$1 = fIntBitsToFloat;
            rangeSlider72.label = i4;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, rangeSlider72, i4, pointerEventPass2);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
                float f6 = f;
                f3 = fIntBitsToFloat;
                obj = objAwaitPointerEvent$default;
                longRef2 = longRef;
                rangeSlider73 = rangeSlider72;
                f2 = f6;
                PointerEvent pointerEvent = (PointerEvent) obj;
                it = pointerEvent.getChanges().iterator();
                while (true) {
                    if (it.hasNext()) {
                        pointerEventPass = pointerEventPass2;
                        next = pointerEventPass;
                        break;
                    }
                    next = it.next();
                    pointerEventPass = pointerEventPass2;
                    if (PointerId.m7170equalsimpl0(((PointerInputChange) next).getId(), longRef2.element)) {
                        break;
                    }
                    pointerEventPass2 = pointerEventPass;
                }
                Intrinsics.checkNotNull(next);
                pointerInputChange = (PointerInputChange) next;
                if (pointerInputChange.isConsumed()) {
                    return pointerEventPass;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    Iterator<T> it2 = pointerEvent.getChanges().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = pointerEventPass;
                            break;
                        }
                        next2 = it2.next();
                        if (((PointerInputChange) next2).getPressed()) {
                            break;
                        }
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) next2;
                    if (pointerInputChange3 == null) {
                        return pointerEventPass;
                    }
                    longRef2.element = pointerInputChange3.getId();
                    fIntBitsToFloat = f3;
                    f = f2;
                } else {
                    fIntBitsToFloat = f3 + (Float.intBitsToFloat((int) (pointerInputChange.getPosition() >> 32)) - Float.intBitsToFloat((int) (pointerInputChange.getPreviousPosition() >> 32)));
                    if (Math.abs(fIntBitsToFloat) < f2) {
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        rangeSlider73.L$0 = function22;
                        rangeSlider73.L$1 = awaitPointerEventScope2;
                        rangeSlider73.L$2 = longRef2;
                        rangeSlider73.L$3 = pointerInputChange;
                        rangeSlider73.F$0 = f2;
                        rangeSlider73.F$1 = fIntBitsToFloat;
                        rangeSlider73.label = 2;
                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, rangeSlider73) != coroutine_suspended) {
                            f = f2;
                            pointerInputChange2 = pointerInputChange;
                            if (pointerInputChange2.isConsumed()) {
                            }
                        }
                    } else {
                        function22.invoke(pointerInputChange, boxing.boxFloat(fIntBitsToFloat - (Math.signum(fIntBitsToFloat) * f2)));
                        if (pointerInputChange.isConsumed()) {
                            return pointerInputChange;
                        }
                        f = f2;
                        fIntBitsToFloat = 0.0f;
                    }
                }
                rangeSlider72 = rangeSlider73;
                longRef = longRef2;
                pointerEventPass2 = pointerEventPass;
                i4 = 1;
                rangeSlider72.L$0 = function22;
                rangeSlider72.L$1 = awaitPointerEventScope2;
                rangeSlider72.L$2 = longRef;
                rangeSlider72.L$3 = pointerEventPass2;
                rangeSlider72.F$0 = f;
                rangeSlider72.F$1 = fIntBitsToFloat;
                rangeSlider72.label = i4;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, rangeSlider72, i4, pointerEventPass2);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        float f7 = rangeSlider7.F$1;
        float f8 = rangeSlider7.F$0;
        Ref.LongRef longRef5 = (Ref.LongRef) rangeSlider7.L$2;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) rangeSlider7.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) rangeSlider7.L$0;
        ResultKt.throwOnFailure(obj);
        RangeSlider7 rangeSlider74 = rangeSlider7;
        f3 = f7;
        awaitPointerEventScope2 = awaitPointerEventScope4;
        rangeSlider73 = rangeSlider74;
        f2 = f8;
        function22 = function24;
        longRef2 = longRef5;
        PointerEvent pointerEvent2 = (PointerEvent) obj;
        it = pointerEvent2.getChanges().iterator();
        while (true) {
            if (it.hasNext()) {
            }
            pointerEventPass2 = pointerEventPass;
        }
        Intrinsics.checkNotNull(next);
        pointerInputChange = (PointerInputChange) next;
        if (pointerInputChange.isConsumed()) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m13981awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        float f;
        Object next;
        float f2;
        Object next2;
        if (m13983isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM13984pointerSlopE8SPZFQ = m13984pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        float f3 = 0.0f;
        while (true) {
            InlineMarker.mark(0);
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            Iterator<T> it = pointerEvent.getChanges().iterator();
            while (true) {
                if (!it.hasNext()) {
                    f = f3;
                    next = null;
                    break;
                }
                next = it.next();
                f = f3;
                if (Boolean.valueOf(PointerId.m7170equalsimpl0(((PointerInputChange) next).getId(), longRef.element)).booleanValue()) {
                    break;
                }
                f3 = f;
            }
            Intrinsics.checkNotNull(next);
            PointerInputChange pointerInputChange = (PointerInputChange) next;
            if (pointerInputChange.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                Iterator<T> it2 = pointerEvent.getChanges().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Boolean.valueOf(((PointerInputChange) next2).getPressed()).booleanValue()) {
                        break;
                    }
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) next2;
                if (pointerInputChange2 == null) {
                    return null;
                }
                longRef.element = pointerInputChange2.getId();
                f2 = f;
            } else {
                float fFloatValue = f + (function1.invoke(Offset.m6534boximpl(pointerInputChange.getPosition())).floatValue() - function1.invoke(Offset.m6534boximpl(pointerInputChange.getPreviousPosition())).floatValue());
                if (Math.abs(fFloatValue) < fM13984pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    InlineMarker.mark(1);
                    if (pointerInputChange.isConsumed()) {
                        return null;
                    }
                    f2 = fFloatValue;
                } else {
                    function2.invoke(pointerInputChange, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fM13984pointerSlopE8SPZFQ)));
                    if (pointerInputChange.isConsumed()) {
                        return pointerInputChange;
                    }
                    f2 = 0.0f;
                    f3 = f2;
                }
            }
            f3 = f2;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m13983isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        Object next;
        Iterator<T> it = pointerEvent.getChanges().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (PointerId.m7170equalsimpl0(((PointerInputChange) next).getId(), j)) {
                break;
            }
        }
        PointerInputChange pointerInputChange = (PointerInputChange) next;
        boolean z = false;
        if (pointerInputChange != null && pointerInputChange.getPressed()) {
            z = true;
        }
        return !z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m13984pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m7203equalsimpl0(i, PointerType.INSTANCE.m7207getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }
}
