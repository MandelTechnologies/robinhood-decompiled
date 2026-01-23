package com.robinhood.android.advisory.returns;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Blur;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutModifier4;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.returns.ReturnsChart7;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aù\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00032\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060$2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(\u001aY\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020!2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020!H\u0007¢\u0006\u0002\u0010,\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006-²\u0006\n\u0010\"\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"ExpansionEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "DURATION_MS", "", "STAGGER_MS", "ReturnsBar", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/advisory/returns/ReturnsBarData;", "frontColors", "Lkotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/ui/graphics/Color;", "leftSideColors", "rightSideColors", "frontBorderColors", "innerShadowColor", "barAreaHeightPx", "", "barIndex", "barCount", "zeroBaselinePx", "zeroBaseLineBorderPx", "labelHeightPx", "labelStyle", "Landroidx/compose/ui/text/TextStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "topShadowColor", "bottomShadowColor", "barWidth", "Landroidx/compose/ui/unit/Dp;", "totalRatio", "allowSelect", "", "selectedIndex", "onSelectBar", "Lkotlin/Function1;", "animPhase", "Lcom/robinhood/android/advisory/returns/ReturnsAnimPhase;", "ReturnsBar-KCtd2fs", "(Lcom/robinhood/android/advisory/returns/ReturnsBarData;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;JFIIFFFLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;FFZILkotlin/jvm/functions/Function1;Lcom/robinhood/android/advisory/returns/ReturnsAnimPhase;Landroidx/compose/runtime/Composer;IIII)V", "ReturnsBarChart", "bars", "showZeroLine", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lcom/robinhood/android/advisory/returns/ReturnsAnimPhase;ZLandroidx/compose/runtime/Composer;II)V", "lib-advisory_externalDebug", "animatedBaselineY"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.returns.ReturnsChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsChart7 {
    private static final int DURATION_MS = 333;
    private static final CubicBezierEasing ExpansionEasing = new CubicBezierEasing(0.33f, 0.0f, 0.0f, 1.0f);
    private static final int STAGGER_MS = 83;

    /* compiled from: ReturnsChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.returns.ReturnsChartKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReturnsChart3.values().length];
            try {
                iArr[ReturnsChart3.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReturnsChart3.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBarChart$lambda$37(ImmutableList immutableList, Modifier modifier, boolean z, Function1 function1, ReturnsChart4 returnsChart4, boolean z2, int i, int i2, Composer composer, int i3) {
        ReturnsBarChart(immutableList, modifier, z, function1, returnsChart4, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBar_KCtd2fs$lambda$31(ReturnsBarData returnsBarData, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, long j, float f, int i, int i2, float f2, float f3, float f4, TextStyle textStyle, Modifier modifier, Color color, Color color2, float f5, float f6, boolean z, int i3, Function1 function1, ReturnsChart4 returnsChart4, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        m11257ReturnsBarKCtd2fs(returnsBarData, immutableList, immutableList2, immutableList3, immutableList4, j, f, i, i2, f2, f3, f4, textStyle, modifier, color, color2, f5, f6, z, i3, function1, returnsChart4, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), RecomposeScopeImpl4.updateChangedFlags(i5), RecomposeScopeImpl4.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* compiled from: ReturnsChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBarChart$2 */
    static final class C93402 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ boolean $allowSelect;
        final /* synthetic */ ReturnsChart4 $animPhase;
        final /* synthetic */ ImmutableList<ReturnsBarData> $bars;
        final /* synthetic */ long $baselineColor;
        final /* synthetic */ Density $density;
        final /* synthetic */ boolean $isDay;
        final /* synthetic */ TextStyle $labelStyle;
        final /* synthetic */ Function1<Integer, Unit> $onSelectBar;
        final /* synthetic */ SnapshotIntState2 $selectedIndex$delegate;
        final /* synthetic */ boolean $showZeroLine;
        final /* synthetic */ TextMeasurer $textMeasurer;

        /* JADX WARN: Multi-variable type inference failed */
        C93402(Density density, ImmutableList<ReturnsBarData> immutableList, TextStyle textStyle, boolean z, long j, TextMeasurer textMeasurer, boolean z2, boolean z3, Function1<? super Integer, Unit> function1, ReturnsChart4 returnsChart4, SnapshotIntState2 snapshotIntState2) {
            this.$density = density;
            this.$bars = immutableList;
            this.$labelStyle = textStyle;
            this.$showZeroLine = z;
            this.$baselineColor = j;
            this.$textMeasurer = textMeasurer;
            this.$allowSelect = z2;
            this.$isDay = z3;
            this.$onSelectBar = function1;
            this.$animPhase = returnsChart4;
            this.$selectedIndex$delegate = snapshotIntState2;
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            Tuples2 tuples2M3642to;
            float f;
            Object objValueOf;
            ReturnsBarData returnsBarData;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            int i2 = (i & 6) == 0 ? i | (composer2.changed(BoxWithConstraints) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1333052732, i2, -1, "com.robinhood.android.advisory.returns.ReturnsBarChart.<anonymous> (ReturnsChart.kt:580)");
            }
            float fMo5016toPx0680j_4 = this.$density.mo5016toPx0680j_4(BoxWithConstraints.mo5102getMaxHeightD9Ej5fM());
            float fMo5016toPx0680j_42 = this.$density.mo5016toPx0680j_4(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM());
            float fMo5016toPx0680j_43 = this.$density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(6));
            float fMo5016toPx0680j_44 = this.$density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(16));
            int size = this.$bars.size();
            float fMo5016toPx0680j_45 = this.$density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(12));
            float f2 = 0.07f * fMo5016toPx0680j_42;
            float f3 = 0.25f * fMo5016toPx0680j_42;
            float f4 = 0.0f;
            if (size <= 1) {
                tuples2M3642to = Tuples4.m3642to(Float.valueOf(RangesKt.coerceAtMost(fMo5016toPx0680j_42, f3)), Float.valueOf(0.0f));
            } else {
                float f5 = size;
                float f6 = size - 1;
                float f7 = (fMo5016toPx0680j_42 - (f5 * f3)) / f6;
                tuples2M3642to = (fMo5016toPx0680j_45 > f7 || f7 > f2) ? f7 > f2 ? Tuples4.m3642to(Float.valueOf(f3), Float.valueOf(f2)) : Tuples4.m3642to(Float.valueOf(RangesKt.coerceAtLeast(RangesKt.coerceAtMost((fMo5016toPx0680j_42 - (f6 * fMo5016toPx0680j_45)) / f5, f3), 0.0f)), Float.valueOf(fMo5016toPx0680j_45)) : Tuples4.m3642to(Float.valueOf(f3), Float.valueOf(f7));
            }
            float fFloatValue = ((Number) tuples2M3642to.component1()).floatValue();
            float fFloatValue2 = ((Number) tuples2M3642to.component2()).floatValue();
            float fMo5012toDpu2uoSUM = this.$density.mo5012toDpu2uoSUM(fFloatValue);
            float fMo5012toDpu2uoSUM2 = this.$density.mo5012toDpu2uoSUM(fFloatValue2);
            composer2.startReplaceGroup(-1746271574);
            boolean zChanged = composer2.changed(this.$bars) | composer2.changed(fFloatValue) | composer2.changed(this.$labelStyle);
            ImmutableList<ReturnsBarData> immutableList = this.$bars;
            Density density = this.$density;
            TextStyle textStyle = this.$labelStyle;
            TextMeasurer textMeasurer = this.$textMeasurer;
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                long jConstraints$default = Constraints2.Constraints$default(0, (int) Math.ceil(fFloatValue), 0, 0, 13, null);
                float fMo5016toPx0680j_46 = 0.0f;
                for (ReturnsBarData returnsBarData2 : immutableList) {
                    long j = jConstraints$default;
                    TextMeasurer textMeasurer2 = textMeasurer;
                    TextStyle textStyle2 = textStyle;
                    float f8 = f4;
                    float size2 = ((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer2, returnsBarData2.getLabel(), TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 0, false, 2, j, null, null, null, false, 972, null).getSize() & 4294967295L)) + ((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer2, returnsBarData2.getCompactValueText(), textStyle2, 0, false, 2, j, null, null, null, false, 972, null).getSize() & 4294967295L));
                    if (size2 > fMo5016toPx0680j_46) {
                        fMo5016toPx0680j_46 = size2;
                    }
                    textMeasurer = textMeasurer2;
                    f4 = f8;
                    textStyle = textStyle2;
                    jConstraints$default = j;
                }
                f = f4;
                if (fMo5016toPx0680j_46 == f) {
                    fMo5016toPx0680j_46 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(40));
                }
                objValueOf = Float.valueOf(fMo5016toPx0680j_46);
                composer2.updateRememberedValue(objValueOf);
            } else {
                objValueOf = objRememberedValue;
                f = 0.0f;
            }
            float fFloatValue3 = ((Number) objValueOf).floatValue();
            composer2.endReplaceGroup();
            float fCoerceAtLeast = RangesKt.coerceAtLeast((fMo5016toPx0680j_4 - fFloatValue3) - fMo5016toPx0680j_43, f);
            ImmutableList<ReturnsBarData> immutableList2 = this.$bars;
            ArrayList arrayList = new ArrayList();
            Iterator<ReturnsBarData> it = immutableList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Float fValueOf = Float.valueOf(it.next().getValueRatio());
                Float f9 = fValueOf.floatValue() > 0.0f ? fValueOf : null;
                if (f9 != null) {
                    arrayList.add(f9);
                }
            }
            ImmutableList<ReturnsBarData> immutableList3 = this.$bars;
            ArrayList arrayList2 = new ArrayList();
            Iterator<ReturnsBarData> it2 = immutableList3.iterator();
            while (it2.hasNext()) {
                Float fValueOf2 = Float.valueOf(it2.next().getValueRatio());
                if (fValueOf2.floatValue() >= 0.0f) {
                    fValueOf2 = null;
                }
                Float fValueOf3 = fValueOf2 != null ? Float.valueOf(Math.abs(fValueOf2.floatValue())) : null;
                if (fValueOf3 != null) {
                    arrayList2.add(fValueOf3);
                }
            }
            Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) arrayList);
            float fFloatValue4 = fMaxOrNull != null ? fMaxOrNull.floatValue() : 0.0f;
            Float fMaxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) arrayList2);
            float fFloatValue5 = fMaxOrNull2 != null ? fMaxOrNull2.floatValue() : 0.0f;
            float f10 = fFloatValue4 + fFloatValue5;
            float fCoerceAtMost = fMo5016toPx0680j_43 + fFloatValue3 + (((arrayList.isEmpty() || arrayList2.isEmpty()) ? !arrayList.isEmpty() ? 1.0f : 0.0f : (f10 - fFloatValue5) / f10) * fCoerceAtLeast);
            if (fFloatValue5 > 0.0f) {
                fCoerceAtMost = RangesKt.coerceAtMost(fCoerceAtMost, fMo5016toPx0680j_4 - fMo5016toPx0680j_44);
            }
            float f11 = fCoerceAtMost;
            float f12 = 2;
            final float fMo5016toPx0680j_47 = this.$density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f12));
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f11, AnimationSpecKt.tween$default(100, 0, ReturnsChart7.ExpansionEasing, 2, null), 0.0f, null, null, composer2, 48, 28);
            composer2.startReplaceGroup(-1163303577);
            if (this.$showZeroLine) {
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(5), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f12));
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer2.changed(snapshotState4AnimateFloatAsState) | composer2.changed(fMo5016toPx0680j_47);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBarChart$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ReturnsChart7.C93402.invoke$lambda$17$lambda$16(fMo5016toPx0680j_47, snapshotState4AnimateFloatAsState, (Density) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                Modifier modifierOffset = OffsetKt.offset(modifierM5156height3ABfNKs, (Function1) objRememberedValue2);
                composer2.startReplaceGroup(5004770);
                boolean zChanged3 = composer2.changed(this.$baselineColor);
                final long j2 = this.$baselineColor;
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBarChart$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ReturnsChart7.C93402.invoke$lambda$19$lambda$18(j2, (DrawScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                BoxKt.Box(DrawModifierKt.drawBehind(modifierOffset, (Function1) objRememberedValue3), composer2, 0);
            }
            composer2.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(fMo5016toPx0680j_4));
            ImmutableList<ReturnsBarData> immutableList4 = this.$bars;
            boolean z = this.$allowSelect;
            boolean z2 = this.$isDay;
            TextStyle textStyle3 = this.$labelStyle;
            final Function1<Integer, Unit> function1 = this.$onSelectBar;
            ReturnsChart4 returnsChart4 = this.$animPhase;
            final SnapshotIntState2 snapshotIntState2 = this.$selectedIndex$delegate;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            float f13 = f11;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            ImmutableList<ReturnsBarData> immutableList5 = immutableList4;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            boolean z3 = z;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z4 = true;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5090spacedByD5KLDUw(fMo5012toDpu2uoSUM2, companion2.getCenterHorizontally()), companion2.getTop(), composer2, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer2.startReplaceGroup(-575279843);
            Iterator<ReturnsBarData> it3 = immutableList5.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                ReturnsBarData next = it3.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ReturnsBarData returnsBarData3 = next;
                boolean z5 = (!z3 || ReturnsChart7.ReturnsBarChart$lambda$35(snapshotIntState2) == -1 || i3 == ReturnsChart7.ReturnsBarChart$lambda$35(snapshotIntState2)) ? z4 : false;
                List<Color> listFront = returnsBarData3.getColors().front(z5, z2);
                long jM11254innerShadowWaAFU9c = returnsBarData3.getColors().m11254innerShadowWaAFU9c(z5, z2);
                List<Color> listFrontBorder = returnsBarData3.getColors().frontBorder(z5, z2);
                List<Color> listLeftSide = returnsBarData3.getColors().leftSide(z5, z2);
                Iterator<ReturnsBarData> it4 = it3;
                List<Color> listRightSide = returnsBarData3.getColors().rightSide(z5, z2);
                Color colorM11255topShadow6MYuD4A = returnsBarData3.getColors().m11255topShadow6MYuD4A(z5, z2);
                Color colorM11253bottomShadow6MYuD4A = returnsBarData3.getColors().m11253bottomShadow6MYuD4A(z5, z2);
                ImmutableList immutableList6 = extensions2.toImmutableList(listFront);
                ImmutableList immutableList7 = extensions2.toImmutableList(listFrontBorder);
                ImmutableList immutableList8 = extensions2.toImmutableList(listLeftSide);
                ImmutableList immutableList9 = extensions2.toImmutableList(listRightSide);
                float f14 = fMo5016toPx0680j_47;
                int size3 = immutableList5.size();
                int iReturnsBarChart$lambda$35 = ReturnsChart7.ReturnsBarChart$lambda$35(snapshotIntState2);
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged4 = composer2.changed(function1);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged4) {
                    returnsBarData = returnsBarData3;
                } else {
                    returnsBarData = returnsBarData3;
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    composer2.endReplaceGroup();
                    boolean z6 = z3;
                    boolean z7 = z2;
                    float f15 = fCoerceAtLeast;
                    TextStyle textStyle4 = textStyle3;
                    float f16 = f13;
                    ReturnsChart4 returnsChart42 = returnsChart4;
                    ReturnsChart7.m11257ReturnsBarKCtd2fs(returnsBarData, immutableList6, immutableList8, immutableList9, immutableList7, jM11254innerShadowWaAFU9c, f15, i3, size3, f16, f14, fFloatValue3, textStyle4, null, colorM11255topShadow6MYuD4A, colorM11253bottomShadow6MYuD4A, fMo5012toDpu2uoSUM, f10, z6, iReturnsBarChart$lambda$35, (Function1) objRememberedValue4, returnsChart42, composer2, 0, 0, 0, 8192);
                    composer2 = composer;
                    fCoerceAtLeast = f15;
                    fMo5016toPx0680j_47 = f14;
                    z3 = z6;
                    returnsChart4 = returnsChart42;
                    i3 = i4;
                    function1 = function1;
                    snapshotIntState2 = snapshotIntState2;
                    immutableList5 = immutableList5;
                    z4 = true;
                    z2 = z7;
                    f13 = f16;
                    textStyle3 = textStyle4;
                    it3 = it4;
                }
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBarChart$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReturnsChart7.C93402.invoke$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20(function1, snapshotIntState2, ((Integer) obj).intValue());
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
                composer2.endReplaceGroup();
                boolean z62 = z3;
                boolean z72 = z2;
                float f152 = fCoerceAtLeast;
                TextStyle textStyle42 = textStyle3;
                float f162 = f13;
                ReturnsChart4 returnsChart422 = returnsChart4;
                ReturnsChart7.m11257ReturnsBarKCtd2fs(returnsBarData, immutableList6, immutableList8, immutableList9, immutableList7, jM11254innerShadowWaAFU9c, f152, i3, size3, f162, f14, fFloatValue3, textStyle42, null, colorM11255topShadow6MYuD4A, colorM11253bottomShadow6MYuD4A, fMo5012toDpu2uoSUM, f10, z62, iReturnsBarChart$lambda$35, (Function1) objRememberedValue4, returnsChart422, composer2, 0, 0, 0, 8192);
                composer2 = composer;
                fCoerceAtLeast = f152;
                fMo5016toPx0680j_47 = f14;
                z3 = z62;
                returnsChart4 = returnsChart422;
                i3 = i4;
                function1 = function1;
                snapshotIntState2 = snapshotIntState2;
                immutableList5 = immutableList5;
                z4 = true;
                z2 = z72;
                f13 = f162;
                textStyle3 = textStyle42;
                it3 = it4;
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        private static final float invoke$lambda$15(SnapshotState4<Float> snapshotState4) {
            return snapshotState4.getValue().floatValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset invoke$lambda$17$lambda$16(float f, SnapshotState4 snapshotState4, Density offset) {
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(((((int) invoke$lambda$15(snapshotState4)) - ((int) f)) & 4294967295L) | (0 << 32)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$18(long j, DrawScope drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            float f = 2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) / f;
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) / f;
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)), 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{6.0f, 14.0f}, 0.0f, 2, null), 0.0f, null, 0, 464, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20(Function1 function1, SnapshotIntState2 snapshotIntState2, int i) {
            function1.invoke(Integer.valueOf(i));
            ReturnsChart7.ReturnsBarChart$lambda$36(snapshotIntState2, i);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ReturnsBarChart$lambda$35(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReturnsBarChart$lambda$36(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBar_KCtd2fs$lambda$1$lambda$0(int i) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
    /* renamed from: ReturnsBar-KCtd2fs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11257ReturnsBarKCtd2fs(final ReturnsBarData data, final ImmutableList<Color> frontColors, final ImmutableList<Color> leftSideColors, final ImmutableList<Color> rightSideColors, final ImmutableList<Color> frontBorderColors, final long j, final float f, final int i, final int i2, final float f2, final float f3, final float f4, final TextStyle labelStyle, Modifier modifier, Color color, Color color2, float f5, float f6, boolean z, int i3, Function1<? super Integer, Unit> function1, ReturnsChart4 returnsChart4, Composer composer, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Color color3;
        Color color4;
        float f7;
        final boolean z2;
        final Function1<? super Integer, Unit> function12;
        float fMo5016toPx0680j_4;
        final HapticFeedback hapticFeedback;
        float f8;
        float f9;
        float f10;
        float fMo5016toPx0680j_42;
        Tuples2 tuples2M3642to;
        final float fFloatValue;
        final float fFloatValue2;
        final float fCoerceAtLeast;
        final ReturnsChart3 returnsChart3From;
        boolean z3;
        float fMin;
        float fMax;
        Object objRememberedValue;
        Composer.Companion companion;
        int i22;
        Animatable animatable;
        Object objRememberedValue2;
        ReturnsChart4 returnsChart42;
        Animatable animatable2;
        Object objRememberedValue3;
        float f11;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue4;
        ReturnsChart4 returnsChart43;
        float f12;
        final float f13;
        final float fCoerceAtLeast2;
        ReturnsChart4 returnsChart44;
        final float fCoerceAtMost;
        float f14;
        boolean zChanged;
        Object obj;
        final float f15;
        int i23;
        final boolean z4;
        final float f16;
        float f17;
        final float f18;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final float f19;
        boolean zChanged2;
        Object objRememberedValue5;
        ReturnsChart4 returnsChart45;
        Animatable animatable3;
        Modifier.Companion companion3;
        Composer composer2;
        float f20;
        float f21;
        Color color5;
        Color color6;
        boolean z5;
        final float f22;
        boolean zChanged3;
        Object objRememberedValue6;
        final Animatable animatable4;
        boolean zChangedInstance2;
        Object objRememberedValue7;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int i24;
        final float f23;
        final ReturnsChart4 returnsChart46;
        final Color color7;
        final Function1<? super Integer, Unit> function13;
        final Color color8;
        final int i25;
        final float f24;
        float f25;
        float f26;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(frontColors, "frontColors");
        Intrinsics.checkNotNullParameter(leftSideColors, "leftSideColors");
        Intrinsics.checkNotNullParameter(rightSideColors, "rightSideColors");
        Intrinsics.checkNotNullParameter(frontBorderColors, "frontBorderColors");
        Intrinsics.checkNotNullParameter(labelStyle, "labelStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(741831790);
        if ((i7 & 1) != 0) {
            i8 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i8 = i4 | (composerStartRestartGroup.changedInstance(data) ? 4 : 2);
        } else {
            i8 = i4;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i4 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(frontColors) ? 32 : 16;
        }
        int i26 = i8;
        if ((i7 & 4) != 0) {
            i26 |= 384;
        } else if ((i4 & 384) == 0) {
            i26 |= composerStartRestartGroup.changed(leftSideColors) ? 256 : 128;
        }
        if ((i7 & 8) != 0) {
            i26 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i26 |= composerStartRestartGroup.changed(rightSideColors) ? 2048 : 1024;
        }
        if ((i7 & 16) != 0) {
            i26 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i26 |= composerStartRestartGroup.changed(frontBorderColors) ? 16384 : 8192;
        }
        if ((i7 & 32) != 0) {
            i26 |= 196608;
            i9 = 131072;
        } else {
            i9 = 131072;
            if ((i4 & 196608) == 0) {
                i26 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
            }
        }
        if ((i7 & 64) != 0) {
            i26 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            i26 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((i7 & 128) != 0) {
            i26 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            i26 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((i7 & 256) != 0) {
            i26 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            i26 |= composerStartRestartGroup.changed(i2) ? 67108864 : 33554432;
        }
        if ((i7 & 512) != 0) {
            i26 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            i26 |= composerStartRestartGroup.changed(f2) ? 536870912 : 268435456;
        }
        int i27 = i26;
        if ((i7 & 1024) != 0) {
            i10 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(f3) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i7 & 2048) != 0) {
            i10 |= 48;
        } else if ((i5 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(f4) ? 32 : 16;
        }
        if ((i7 & 4096) != 0) {
            i10 |= 384;
        } else {
            if ((i5 & 384) == 0) {
                i10 |= composerStartRestartGroup.changed(labelStyle) ? 256 : 128;
            }
            i11 = i7 & 8192;
            if (i11 == 0) {
                i10 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    i10 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
                }
                i12 = i7 & 16384;
                if (i12 == 0) {
                    i13 = i12;
                    if ((i5 & 24576) == 0) {
                        i10 |= composerStartRestartGroup.changed(color) ? 16384 : 8192;
                    }
                    i14 = i7 & 32768;
                    if (i14 == 0) {
                        i10 |= 196608;
                    } else if ((i5 & 196608) == 0) {
                        i10 |= composerStartRestartGroup.changed(color2) ? i9 : 65536;
                    }
                    i15 = i7 & 65536;
                    if (i15 == 0) {
                        i10 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        i10 |= composerStartRestartGroup.changed(f5) ? 1048576 : 524288;
                    }
                    i16 = i7 & i9;
                    if (i16 == 0) {
                        i10 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        i10 |= composerStartRestartGroup.changed(f6) ? 8388608 : 4194304;
                    }
                    i17 = i7 & 262144;
                    if (i17 == 0) {
                        i10 |= 100663296;
                    } else if ((i5 & 100663296) == 0) {
                        i10 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                    }
                    i18 = i7 & 524288;
                    if (i18 == 0) {
                        i10 |= 805306368;
                    } else if ((i5 & 805306368) == 0) {
                        i10 |= composerStartRestartGroup.changed(i3) ? 536870912 : 268435456;
                    }
                    i19 = i7 & 1048576;
                    if (i19 == 0) {
                        i20 = i6 | 6;
                    } else if ((i6 & 6) == 0) {
                        i20 = i6 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                    } else {
                        i20 = i6;
                    }
                    i21 = i7 & 2097152;
                    if (i21 == 0) {
                        i20 |= 48;
                    } else if ((i6 & 48) == 0) {
                        i20 |= composerStartRestartGroup.changed(returnsChart4 == null ? -1 : returnsChart4.ordinal()) ? 32 : 16;
                    }
                    if ((i27 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i20 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        color7 = color;
                        color8 = color2;
                        f23 = f5;
                        f24 = f6;
                        z4 = z;
                        i25 = i3;
                        function13 = function1;
                        returnsChart46 = returnsChart4;
                        composer2 = composerStartRestartGroup;
                    } else {
                        Modifier modifier2 = i11 == 0 ? Modifier.INSTANCE : modifier;
                        color3 = i13 == 0 ? null : color;
                        color4 = i14 == 0 ? null : color2;
                        float fM7995constructorimpl = i15 == 0 ? C2002Dp.m7995constructorimpl(40) : f5;
                        f7 = i16 == 0 ? 1.0f : f6;
                        z2 = i17 == 0 ? false : z;
                        int i28 = i18 == 0 ? -1 : i3;
                        if (i19 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$1$lambda$0(((Integer) obj2).intValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function12 = (Function1) objRememberedValue8;
                        } else {
                            function12 = function1;
                        }
                        ReturnsChart4 returnsChart47 = i21 == 0 ? ReturnsChart4.IN_PLACE : returnsChart4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(741831790, i27, i10, "com.robinhood.android.advisory.returns.ReturnsBar (ReturnsChart.kt:177)");
                        }
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        float fMo5016toPx0680j_43 = density.mo5016toPx0680j_4(fM7995constructorimpl);
                        float f27 = 6;
                        fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f27));
                        float f28 = 2;
                        float fMo5016toPx0680j_44 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f28));
                        float fMo5016toPx0680j_45 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f27));
                        hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        float f29 = fMo5016toPx0680j_45 - fMo5016toPx0680j_44;
                        float f30 = i2 - 1;
                        f8 = fMo5016toPx0680j_44 + ((i / f30) * f29);
                        f9 = fMo5016toPx0680j_44 + (f29 * ((r8 - i) / f30));
                        f10 = f8 + f9;
                        fMo5016toPx0680j_42 = fMo5016toPx0680j_43 - density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f28));
                        if (f10 >= fMo5016toPx0680j_42 || f10 <= 0.0f) {
                            tuples2M3642to = Tuples4.m3642to(Float.valueOf(f8), Float.valueOf(f9));
                        } else {
                            float fCoerceIn = RangesKt.coerceIn(fMo5016toPx0680j_42 / f10, 0.0f, 1.0f);
                            tuples2M3642to = Tuples4.m3642to(Float.valueOf(f8 * fCoerceIn), Float.valueOf(fCoerceIn * f9));
                        }
                        fFloatValue = ((Number) tuples2M3642to.component1()).floatValue();
                        fFloatValue2 = ((Number) tuples2M3642to.component2()).floatValue();
                        fCoerceAtLeast = RangesKt.coerceAtLeast((fMo5016toPx0680j_43 - fFloatValue) - fFloatValue2, 0.0f);
                        returnsChart3From = ReturnsChart3.INSTANCE.from(Math.min(1.0f, Math.abs(data.getValueRatio() / f7)));
                        boolean z6 = data.getValueRatio() < 0.0f;
                        float fMo5016toPx0680j_46 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f27));
                        if (f7 <= 0.0f) {
                            z3 = z6;
                            fMin = Math.min(1.0f, Math.abs(data.getValueRatio() / f7)) * f;
                        } else {
                            z3 = z6;
                            fMin = 0.0f;
                        }
                        fMax = Math.max(fMin, fMo5016toPx0680j_46);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue != companion.getEmpty()) {
                            if (returnsChart47 == ReturnsChart4.INTRO) {
                                f25 = 0.0f;
                                i22 = i10;
                                f26 = 0.0f;
                            } else {
                                f25 = fMax;
                                i22 = i10;
                                f26 = 0.0f;
                            }
                            objRememberedValue = Animatable2.Animatable$default(f25, f26, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            i22 = i10;
                        }
                        animatable = (Animatable) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 != companion.getEmpty()) {
                            returnsChart42 = returnsChart47;
                            objRememberedValue2 = Animatable2.Animatable$default(returnsChart47 == ReturnsChart4.INTRO ? 0.0f : 1.0f, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            returnsChart42 = returnsChart47;
                        }
                        animatable2 = (Animatable) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        float fFloatValue3 = ((Number) animatable.getValue()).floatValue();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                            f11 = fFloatValue3;
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            f11 = fFloatValue3;
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Float fValueOf = Float.valueOf(fMax);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i29 = i20 & 112;
                        int i30 = i27 & 29360128;
                        zChangedInstance = (i29 != 32) | (i30 != 8388608) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fMax) | composerStartRestartGroup.changedInstance(animatable2);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                            ReturnsChart4 returnsChart48 = returnsChart42;
                            objRememberedValue4 = new ReturnsChart8(returnsChart48, i, animatable, fMax, animatable2, null);
                            returnsChart43 = returnsChart48;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            returnsChart43 = returnsChart42;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(fValueOf, returnsChart43, (Function2) objRememberedValue4, composerStartRestartGroup, i29);
                        f12 = !z3 ? f2 - f11 : f2 - f3;
                        f13 = !z3 ? f2 : (f2 - f3) + f11;
                        float f31 = f + f4 + fMo5016toPx0680j_4;
                        fCoerceAtLeast2 = RangesKt.coerceAtLeast(f12, 0.0f);
                        returnsChart44 = returnsChart43;
                        fCoerceAtMost = RangesKt.coerceAtMost(f13, f31);
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier2, fM7995constructorimpl), density.mo5012toDpu2uoSUM(f31));
                        modifier = modifier2;
                        f14 = fM7995constructorimpl;
                        Object[] objArr = {Boolean.valueOf(z2), snapshotState.getValue(), Float.valueOf(f12), Float.valueOf(f13)};
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i20 & 14) != 4) | ((i22 & 234881024) != 67108864) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changed(fCoerceAtLeast) | composerStartRestartGroup.changed(f12) | ((i22 & 112) != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changed(f13) | composerStartRestartGroup.changed(fFloatValue2) | composerStartRestartGroup.changedInstance(hapticFeedback) | (i30 != 8388608);
                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue9 == companion.getEmpty()) {
                            final float f32 = f12;
                            f15 = fMo5016toPx0680j_4;
                            final float f33 = f13;
                            i23 = i22;
                            obj = new PointerInputEventHandler() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$4$1

                                /* compiled from: ReturnsChart.kt */
                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$4$1$1", m3645f = "ReturnsChart.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, 302}, m3647m = "invokeSuspend")
                                /* renamed from: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$4$1$1 */
                                static final class C93391 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ float $barBottomPx;
                                    final /* synthetic */ int $barIndex;
                                    final /* synthetic */ float $barTopPx;
                                    final /* synthetic */ float $frontWidthPx;
                                    final /* synthetic */ HapticFeedback $hapticFeedback;
                                    final /* synthetic */ float $labelBottomPaddingPx;
                                    final /* synthetic */ float $labelHeightPx;
                                    final /* synthetic */ SnapshotState<Boolean> $labelVisible;
                                    final /* synthetic */ float $leftSidePx;
                                    final /* synthetic */ Function1<Integer, Unit> $onSelectBar;
                                    final /* synthetic */ float $rightSidePx;
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    C93391(float f, float f2, float f3, SnapshotState<Boolean> snapshotState, float f4, float f5, float f6, float f7, HapticFeedback hapticFeedback, Function1<? super Integer, Unit> function1, int i, Continuation<? super C93391> continuation) {
                                        super(2, continuation);
                                        this.$leftSidePx = f;
                                        this.$frontWidthPx = f2;
                                        this.$barTopPx = f3;
                                        this.$labelVisible = snapshotState;
                                        this.$labelHeightPx = f4;
                                        this.$labelBottomPaddingPx = f5;
                                        this.$barBottomPx = f6;
                                        this.$rightSidePx = f7;
                                        this.$hapticFeedback = hapticFeedback;
                                        this.$onSelectBar = function1;
                                        this.$barIndex = i;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        C93391 c93391 = new C93391(this.$leftSidePx, this.$frontWidthPx, this.$barTopPx, this.$labelVisible, this.$labelHeightPx, this.$labelBottomPaddingPx, this.$barBottomPx, this.$rightSidePx, this.$hapticFeedback, this.$onSelectBar, this.$barIndex, continuation);
                                        c93391.L$0 = obj;
                                        return c93391;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                        return ((C93391) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
                                    
                                        if (androidx.compose.foundation.gestures.TapGestureDetector4.waitForUpOrCancellation$default(r1, null, r12, 1, null) == r0) goto L29;
                                     */
                                    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object invokeSuspend(Object obj) {
                                        C93391 c93391;
                                        AwaitPointerEventScope awaitPointerEventScope;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                            this.L$0 = awaitPointerEventScope2;
                                            this.label = 1;
                                            c93391 = this;
                                            obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c93391, 3, null);
                                            if (obj != coroutine_suspended) {
                                                awaitPointerEventScope = awaitPointerEventScope2;
                                            }
                                            return coroutine_suspended;
                                        }
                                        if (i != 1) {
                                            if (i != 2) {
                                                if (i != 3) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                                c93391 = this;
                                                c93391.$onSelectBar.invoke(boxing.boxInt(-1));
                                                return Unit.INSTANCE;
                                            }
                                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            c93391 = this;
                                            if (((PointerInputChange) obj) != null) {
                                                c93391.$hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                                                c93391.$onSelectBar.invoke(boxing.boxInt(c93391.$barIndex));
                                                c93391.L$0 = null;
                                                c93391.label = 3;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        c93391 = this;
                                        PointerInputChange pointerInputChange = (PointerInputChange) obj;
                                        if (new Rect(0.0f, Math.min(c93391.$barTopPx - (c93391.$labelVisible.getValue().booleanValue() ? c93391.$labelHeightPx + c93391.$labelBottomPaddingPx : 0.0f), c93391.$barBottomPx), c93391.$leftSidePx + c93391.$frontWidthPx + c93391.$rightSidePx, Math.max(c93391.$barBottomPx, c93391.$barTopPx)).m6555containsk4lQ0M(pointerInputChange.getPosition())) {
                                            long id = pointerInputChange.getId();
                                            c93391.L$0 = awaitPointerEventScope;
                                            c93391.label = 2;
                                            obj = DragGestureDetectorKt.m4975awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, this);
                                            if (obj != coroutine_suspended) {
                                                if (((PointerInputChange) obj) != null) {
                                                }
                                            }
                                            return coroutine_suspended;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                    if (z2) {
                                        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C93391(fFloatValue, fCoerceAtLeast, f32, snapshotState, f4, f15, f33, fFloatValue2, hapticFeedback, function12, i, null), continuation);
                                        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            z4 = z2;
                            f16 = fFloatValue;
                            f17 = fCoerceAtLeast;
                            f18 = f32;
                            composerStartRestartGroup.updateRememberedValue(obj);
                        } else {
                            obj = objRememberedValue9;
                            f15 = fMo5016toPx0680j_4;
                            f16 = fFloatValue;
                            f17 = fCoerceAtLeast;
                            z4 = z2;
                            f18 = f12;
                            i23 = i22;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM5156height3ABfNKs, objArr, (PointerInputEventHandler) obj);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        companion2 = Modifier.INSTANCE;
                        Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion2);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierMatchParentSize);
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor2);
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        int i31 = i23;
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                        Modifier modifierM6449blurF8QBwvs$default = Blur.m6449blurF8QBwvs$default(boxScopeInstance.matchParentSize(companion2), C2002Dp.m7995constructorimpl((float) 0.5d), null, 2, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        f19 = f11;
                        zChanged2 = composerStartRestartGroup.changed(f16) | composerStartRestartGroup.changed(f17) | composerStartRestartGroup.changed(returnsChart3From.ordinal()) | ((i27 & 57344) != 16384) | composerStartRestartGroup.changed(fCoerceAtLeast2) | composerStartRestartGroup.changed(fCoerceAtMost) | composerStartRestartGroup.changed(fFloatValue2) | ((i27 & 896) != 256) | composerStartRestartGroup.changed(f18) | composerStartRestartGroup.changed(f13) | ((i27 & 7168) != 2048) | ((i27 & 112) != 32) | ((458752 & i27) != i9) | ((i31 & 57344) != 16384) | composerStartRestartGroup.changed(f19) | ((i31 & 458752) != 131072);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                            returnsChart45 = returnsChart44;
                            animatable3 = animatable2;
                            companion3 = companion2;
                            final float f34 = f16;
                            composer2 = composerStartRestartGroup;
                            final float f35 = f17;
                            f20 = f15;
                            final Color color9 = color3;
                            final Color color10 = color4;
                            f21 = f14;
                            Function1 function14 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$30$lambda$22$lambda$21$lambda$20(f34, f35, returnsChart3From, frontBorderColors, fCoerceAtMost, fCoerceAtLeast2, fFloatValue2, leftSideColors, f18, f13, rightSideColors, frontColors, j, color9, f19, color10, (DrawScope) obj2);
                                }
                            };
                            f16 = f34;
                            color5 = color9;
                            color6 = color10;
                            composer2.updateRememberedValue(function14);
                            objRememberedValue5 = function14;
                        } else {
                            returnsChart45 = returnsChart44;
                            animatable3 = animatable2;
                            companion3 = companion2;
                            composer2 = composerStartRestartGroup;
                            f20 = f15;
                            color5 = color3;
                            color6 = color4;
                            f21 = f14;
                        }
                        composer2.endReplaceGroup();
                        Canvas2.Canvas(modifierM6449blurF8QBwvs$default, (Function1) objRememberedValue5, composer2, 0);
                        composer2.endNode();
                        int i32 = i28;
                        boolean z7 = i32 != i;
                        z5 = z4 || i32 == -1;
                        boolean z8 = (z4 || !z7 || i32 == -1) ? false : true;
                        composer2.startReplaceGroup(-1746271574);
                        f22 = f20;
                        zChanged3 = composer2.changed(f16) | composer2.changed(f18) | composer2.changed(f22);
                        objRememberedValue6 = composer2.rememberedValue();
                        if (!zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function3() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$30$lambda$25$lambda$24(f16, f18, f22, (MeasureScope) obj2, (Measurable) obj3, (Constraints) obj4);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceGroup();
                        Modifier.Companion companion6 = companion3;
                        Modifier modifierLayout = LayoutModifier4.layout(companion6, (Function3) objRememberedValue6);
                        composer2.startReplaceGroup(5004770);
                        animatable4 = animatable3;
                        zChangedInstance2 = composer2.changedInstance(animatable4);
                        objRememberedValue7 = composer2.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$30$lambda$27$lambda$26(animatable4, (GraphicsLayerScope) obj2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierLayout, (Function1) objRememberedValue7);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierGraphicsLayer);
                        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor3);
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getStart(), composer2, 48);
                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, companion6);
                        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor4);
                        }
                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        if (z5) {
                            i24 = i32;
                            if (z8) {
                                composer2.startReplaceGroup(26832874);
                                BentoText2.m20747BentoText38GnDrw(data.getFullValueText(), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 2, 0, null, 0, labelStyle, composer2, 805330944, (i31 << 3) & 7168, 7658);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(27125979);
                                composer2.endReplaceGroup();
                            }
                        } else {
                            composer2.startReplaceGroup(26286406);
                            i24 = i32;
                            String label = data.getLabel();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i33 = BentoTheme.$stable;
                            int i34 = (i31 << 3) & 7168;
                            Composer composer3 = composer2;
                            BentoText2.m20747BentoText38GnDrw(label, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i33).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 2, 0, null, 0, labelStyle, composer3, 805330944, i34, 7658);
                            BentoText2.m20747BentoText38GnDrw(data.getCompactValueText(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i33).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 2, 0, null, 0, labelStyle, composer3, 805306368, i34, 7674);
                            composer2 = composer3;
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f23 = f21;
                        returnsChart46 = returnsChart45;
                        color7 = color5;
                        function13 = function12;
                        color8 = color6;
                        i25 = i24;
                        f24 = f7;
                    }
                    final Modifier modifier3 = modifier;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$31(data, frontColors, leftSideColors, rightSideColors, frontBorderColors, j, f, i, i2, f2, f3, f4, labelStyle, modifier3, color7, color8, f23, f24, z4, i25, function13, returnsChart46, i4, i5, i6, i7, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i10 |= 24576;
                i13 = i12;
                i14 = i7 & 32768;
                if (i14 == 0) {
                }
                i15 = i7 & 65536;
                if (i15 == 0) {
                }
                i16 = i7 & i9;
                if (i16 == 0) {
                }
                i17 = i7 & 262144;
                if (i17 == 0) {
                }
                i18 = i7 & 524288;
                if (i18 == 0) {
                }
                i19 = i7 & 1048576;
                if (i19 == 0) {
                }
                i21 = i7 & 2097152;
                if (i21 == 0) {
                }
                if ((i27 & 306783379) != 306783378) {
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    float fMo5016toPx0680j_432 = density2.mo5016toPx0680j_4(fM7995constructorimpl);
                    float f272 = 6;
                    fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f272));
                    float f282 = 2;
                    float fMo5016toPx0680j_442 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f282));
                    float fMo5016toPx0680j_452 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f272));
                    hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    float f292 = fMo5016toPx0680j_452 - fMo5016toPx0680j_442;
                    float f302 = i2 - 1;
                    f8 = fMo5016toPx0680j_442 + ((i / f302) * f292);
                    f9 = fMo5016toPx0680j_442 + (f292 * ((r8 - i) / f302));
                    f10 = f8 + f9;
                    fMo5016toPx0680j_42 = fMo5016toPx0680j_432 - density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f282));
                    if (f10 >= fMo5016toPx0680j_42) {
                        tuples2M3642to = Tuples4.m3642to(Float.valueOf(f8), Float.valueOf(f9));
                        fFloatValue = ((Number) tuples2M3642to.component1()).floatValue();
                        fFloatValue2 = ((Number) tuples2M3642to.component2()).floatValue();
                        fCoerceAtLeast = RangesKt.coerceAtLeast((fMo5016toPx0680j_432 - fFloatValue) - fFloatValue2, 0.0f);
                        returnsChart3From = ReturnsChart3.INSTANCE.from(Math.min(1.0f, Math.abs(data.getValueRatio() / f7)));
                        if (data.getValueRatio() < 0.0f) {
                        }
                        float fMo5016toPx0680j_462 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f272));
                        if (f7 <= 0.0f) {
                        }
                        fMax = Math.max(fMin, fMo5016toPx0680j_462);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue != companion.getEmpty()) {
                        }
                        animatable = (Animatable) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 != companion.getEmpty()) {
                        }
                        animatable2 = (Animatable) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        float fFloatValue32 = ((Number) animatable.getValue()).floatValue();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Float fValueOf2 = Float.valueOf(fMax);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i292 = i20 & 112;
                        int i302 = i27 & 29360128;
                        zChangedInstance = (i292 != 32) | (i302 != 8388608) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fMax) | composerStartRestartGroup.changedInstance(animatable2);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            ReturnsChart4 returnsChart482 = returnsChart42;
                            objRememberedValue4 = new ReturnsChart8(returnsChart482, i, animatable, fMax, animatable2, null);
                            returnsChart43 = returnsChart482;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(fValueOf2, returnsChart43, (Function2) objRememberedValue4, composerStartRestartGroup, i292);
                            if (!z3) {
                            }
                            if (!z3) {
                            }
                            float f312 = f + f4 + fMo5016toPx0680j_4;
                            fCoerceAtLeast2 = RangesKt.coerceAtLeast(f12, 0.0f);
                            returnsChart44 = returnsChart43;
                            fCoerceAtMost = RangesKt.coerceAtMost(f13, f312);
                            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier2, fM7995constructorimpl), density2.mo5012toDpu2uoSUM(f312));
                            modifier = modifier2;
                            f14 = fM7995constructorimpl;
                            Object[] objArr2 = {Boolean.valueOf(z2), snapshotState.getValue(), Float.valueOf(f12), Float.valueOf(f13)};
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChanged = ((i20 & 14) != 4) | ((i22 & 234881024) != 67108864) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changed(fCoerceAtLeast) | composerStartRestartGroup.changed(f12) | ((i22 & 112) != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changed(f13) | composerStartRestartGroup.changed(fFloatValue2) | composerStartRestartGroup.changedInstance(hapticFeedback) | (i302 != 8388608);
                            Object objRememberedValue92 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                final float f322 = f12;
                                f15 = fMo5016toPx0680j_4;
                                final float f332 = f13;
                                i23 = i22;
                                obj = new PointerInputEventHandler() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$4$1

                                    /* compiled from: ReturnsChart.kt */
                                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$4$1$1", m3645f = "ReturnsChart.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, 302}, m3647m = "invokeSuspend")
                                    /* renamed from: com.robinhood.android.advisory.returns.ReturnsChartKt$ReturnsBar$4$1$1 */
                                    static final class C93391 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ float $barBottomPx;
                                        final /* synthetic */ int $barIndex;
                                        final /* synthetic */ float $barTopPx;
                                        final /* synthetic */ float $frontWidthPx;
                                        final /* synthetic */ HapticFeedback $hapticFeedback;
                                        final /* synthetic */ float $labelBottomPaddingPx;
                                        final /* synthetic */ float $labelHeightPx;
                                        final /* synthetic */ SnapshotState<Boolean> $labelVisible;
                                        final /* synthetic */ float $leftSidePx;
                                        final /* synthetic */ Function1<Integer, Unit> $onSelectBar;
                                        final /* synthetic */ float $rightSidePx;
                                        private /* synthetic */ Object L$0;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        C93391(float f, float f2, float f3, SnapshotState<Boolean> snapshotState, float f4, float f5, float f6, float f7, HapticFeedback hapticFeedback, Function1<? super Integer, Unit> function1, int i, Continuation<? super C93391> continuation) {
                                            super(2, continuation);
                                            this.$leftSidePx = f;
                                            this.$frontWidthPx = f2;
                                            this.$barTopPx = f3;
                                            this.$labelVisible = snapshotState;
                                            this.$labelHeightPx = f4;
                                            this.$labelBottomPaddingPx = f5;
                                            this.$barBottomPx = f6;
                                            this.$rightSidePx = f7;
                                            this.$hapticFeedback = hapticFeedback;
                                            this.$onSelectBar = function1;
                                            this.$barIndex = i;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            C93391 c93391 = new C93391(this.$leftSidePx, this.$frontWidthPx, this.$barTopPx, this.$labelVisible, this.$labelHeightPx, this.$labelBottomPaddingPx, this.$barBottomPx, this.$rightSidePx, this.$hapticFeedback, this.$onSelectBar, this.$barIndex, continuation);
                                            c93391.L$0 = obj;
                                            return c93391;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                            return ((C93391) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
                                        
                                            if (androidx.compose.foundation.gestures.TapGestureDetector4.waitForUpOrCancellation$default(r1, null, r12, 1, null) == r0) goto L29;
                                         */
                                        /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Object invokeSuspend(Object obj) {
                                            C93391 c93391;
                                            AwaitPointerEventScope awaitPointerEventScope;
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                                this.L$0 = awaitPointerEventScope2;
                                                this.label = 1;
                                                c93391 = this;
                                                obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c93391, 3, null);
                                                if (obj != coroutine_suspended) {
                                                    awaitPointerEventScope = awaitPointerEventScope2;
                                                }
                                                return coroutine_suspended;
                                            }
                                            if (i != 1) {
                                                if (i != 2) {
                                                    if (i != 3) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                    c93391 = this;
                                                    c93391.$onSelectBar.invoke(boxing.boxInt(-1));
                                                    return Unit.INSTANCE;
                                                }
                                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                                ResultKt.throwOnFailure(obj);
                                                c93391 = this;
                                                if (((PointerInputChange) obj) != null) {
                                                    c93391.$hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                                                    c93391.$onSelectBar.invoke(boxing.boxInt(c93391.$barIndex));
                                                    c93391.L$0 = null;
                                                    c93391.label = 3;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            c93391 = this;
                                            PointerInputChange pointerInputChange = (PointerInputChange) obj;
                                            if (new Rect(0.0f, Math.min(c93391.$barTopPx - (c93391.$labelVisible.getValue().booleanValue() ? c93391.$labelHeightPx + c93391.$labelBottomPaddingPx : 0.0f), c93391.$barBottomPx), c93391.$leftSidePx + c93391.$frontWidthPx + c93391.$rightSidePx, Math.max(c93391.$barBottomPx, c93391.$barTopPx)).m6555containsk4lQ0M(pointerInputChange.getPosition())) {
                                                long id = pointerInputChange.getId();
                                                c93391.L$0 = awaitPointerEventScope;
                                                c93391.label = 2;
                                                obj = DragGestureDetectorKt.m4975awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, this);
                                                if (obj != coroutine_suspended) {
                                                    if (((PointerInputChange) obj) != null) {
                                                    }
                                                }
                                                return coroutine_suspended;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                        if (z2) {
                                            Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C93391(fFloatValue, fCoerceAtLeast, f322, snapshotState, f4, f15, f332, fFloatValue2, hapticFeedback, function12, i, null), continuation);
                                            return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                z4 = z2;
                                f16 = fFloatValue;
                                f17 = fCoerceAtLeast;
                                f18 = f322;
                                composerStartRestartGroup.updateRememberedValue(obj);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierM5156height3ABfNKs2, objArr2, (PointerInputEventHandler) obj);
                                Alignment.Companion companion42 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput2);
                                ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor5 = companion52.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, companion52.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion52.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion52.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    companion2 = Modifier.INSTANCE;
                                    Modifier modifierMatchParentSize2 = boxScopeInstance2.matchParentSize(companion2);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierMatchParentSize2);
                                    Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    int i312 = i23;
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion52.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting()) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                                        Modifier modifierM6449blurF8QBwvs$default2 = Blur.m6449blurF8QBwvs$default(boxScopeInstance2.matchParentSize(companion2), C2002Dp.m7995constructorimpl((float) 0.5d), null, 2, null);
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        f19 = f11;
                                        zChanged2 = composerStartRestartGroup.changed(f16) | composerStartRestartGroup.changed(f17) | composerStartRestartGroup.changed(returnsChart3From.ordinal()) | ((i27 & 57344) != 16384) | composerStartRestartGroup.changed(fCoerceAtLeast2) | composerStartRestartGroup.changed(fCoerceAtMost) | composerStartRestartGroup.changed(fFloatValue2) | ((i27 & 896) != 256) | composerStartRestartGroup.changed(f18) | composerStartRestartGroup.changed(f13) | ((i27 & 7168) != 2048) | ((i27 & 112) != 32) | ((458752 & i27) != i9) | ((i312 & 57344) != 16384) | composerStartRestartGroup.changed(f19) | ((i312 & 458752) != 131072);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged2) {
                                            returnsChart45 = returnsChart44;
                                            animatable3 = animatable2;
                                            companion3 = companion2;
                                            final float f342 = f16;
                                            composer2 = composerStartRestartGroup;
                                            final float f352 = f17;
                                            f20 = f15;
                                            final Color color92 = color3;
                                            final Color color102 = color4;
                                            f21 = f14;
                                            Function1 function142 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$30$lambda$22$lambda$21$lambda$20(f342, f352, returnsChart3From, frontBorderColors, fCoerceAtMost, fCoerceAtLeast2, fFloatValue2, leftSideColors, f18, f13, rightSideColors, frontColors, j, color92, f19, color102, (DrawScope) obj2);
                                                }
                                            };
                                            f16 = f342;
                                            color5 = color92;
                                            color6 = color102;
                                            composer2.updateRememberedValue(function142);
                                            objRememberedValue5 = function142;
                                            composer2.endReplaceGroup();
                                            Canvas2.Canvas(modifierM6449blurF8QBwvs$default2, (Function1) objRememberedValue5, composer2, 0);
                                            composer2.endNode();
                                            int i322 = i28;
                                            if (i322 != i) {
                                            }
                                            if (z4) {
                                                if (z4) {
                                                    composer2.startReplaceGroup(-1746271574);
                                                    f22 = f20;
                                                    zChanged3 = composer2.changed(f16) | composer2.changed(f18) | composer2.changed(f22);
                                                    objRememberedValue6 = composer2.rememberedValue();
                                                    if (!zChanged3) {
                                                        objRememberedValue6 = new Function3() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda5
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                                return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$30$lambda$25$lambda$24(f16, f18, f22, (MeasureScope) obj2, (Measurable) obj3, (Constraints) obj4);
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(objRememberedValue6);
                                                        composer2.endReplaceGroup();
                                                        Modifier.Companion companion62 = companion3;
                                                        Modifier modifierLayout2 = LayoutModifier4.layout(companion62, (Function3) objRememberedValue6);
                                                        composer2.startReplaceGroup(5004770);
                                                        animatable4 = animatable3;
                                                        zChangedInstance2 = composer2.changedInstance(animatable4);
                                                        objRememberedValue7 = composer2.rememberedValue();
                                                        if (!zChangedInstance2) {
                                                            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda6
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj2) {
                                                                    return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$30$lambda$27$lambda$26(animatable4, (GraphicsLayerScope) obj2);
                                                                }
                                                            };
                                                            composer2.updateRememberedValue(objRememberedValue7);
                                                            composer2.endReplaceGroup();
                                                            Modifier modifierGraphicsLayer2 = GraphicsLayerModifier6.graphicsLayer(modifierLayout2, (Function1) objRememberedValue7);
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
                                                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                            CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierGraphicsLayer2);
                                                            Function0<ComposeUiNode> constructor32 = companion52.getConstructor();
                                                            if (composer2.getApplier() == null) {
                                                            }
                                                            composer2.startReusableNode();
                                                            if (composer2.getInserting()) {
                                                            }
                                                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy32, companion52.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion52.getSetResolvedCompositionLocals());
                                                            setCompositeKeyHash3 = companion52.getSetCompositeKeyHash();
                                                            if (!composerM6388constructorimpl3.getInserting()) {
                                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion52.getSetModifier());
                                                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion42.getStart(), composer2, 48);
                                                                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                                CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer2, companion62);
                                                                Function0<ComposeUiNode> constructor42 = companion52.getConstructor();
                                                                if (composer2.getApplier() == null) {
                                                                }
                                                                composer2.startReusableNode();
                                                                if (composer2.getInserting()) {
                                                                }
                                                                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion52.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion52.getSetResolvedCompositionLocals());
                                                                setCompositeKeyHash4 = companion52.getSetCompositeKeyHash();
                                                                if (!composerM6388constructorimpl4.getInserting()) {
                                                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion52.getSetModifier());
                                                                    Column6 column62 = Column6.INSTANCE;
                                                                    if (z5) {
                                                                    }
                                                                    composer2.endNode();
                                                                    composer2.endNode();
                                                                    composer2.endNode();
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    f23 = f21;
                                                                    returnsChart46 = returnsChart45;
                                                                    color7 = color5;
                                                                    function13 = function12;
                                                                    color8 = color6;
                                                                    i25 = i24;
                                                                    f24 = f7;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final Modifier modifier32 = modifier;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i12 = i7 & 16384;
            if (i12 == 0) {
            }
            i14 = i7 & 32768;
            if (i14 == 0) {
            }
            i15 = i7 & 65536;
            if (i15 == 0) {
            }
            i16 = i7 & i9;
            if (i16 == 0) {
            }
            i17 = i7 & 262144;
            if (i17 == 0) {
            }
            i18 = i7 & 524288;
            if (i18 == 0) {
            }
            i19 = i7 & 1048576;
            if (i19 == 0) {
            }
            i21 = i7 & 2097152;
            if (i21 == 0) {
            }
            if ((i27 & 306783379) != 306783378) {
            }
            final Modifier modifier322 = modifier;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i11 = i7 & 8192;
        if (i11 == 0) {
        }
        i12 = i7 & 16384;
        if (i12 == 0) {
        }
        i14 = i7 & 32768;
        if (i14 == 0) {
        }
        i15 = i7 & 65536;
        if (i15 == 0) {
        }
        i16 = i7 & i9;
        if (i16 == 0) {
        }
        i17 = i7 & 262144;
        if (i17 == 0) {
        }
        i18 = i7 & 524288;
        if (i18 == 0) {
        }
        i19 = i7 & 1048576;
        if (i19 == 0) {
        }
        i21 = i7 & 2097152;
        if (i21 == 0) {
        }
        if ((i27 & 306783379) != 306783378) {
        }
        final Modifier modifier3222 = modifier;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit ReturnsBar_KCtd2fs$lambda$30$lambda$22$lambda$21$lambda$20(float f, float f2, ReturnsChart3 returnsChart3, ImmutableList immutableList, float f3, float f4, float f5, ImmutableList immutableList2, float f6, float f7, ImmutableList immutableList3, ImmutableList immutableList4, long j, Color color, float f8, Color color2, DrawScope Canvas) throws Throwable {
        float fMo5016toPx0680j_4;
        Path path;
        float f9;
        long j2;
        Brush.Companion companion;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f10 = f + f2;
        int i = WhenMappings.$EnumSwitchMapping$0[returnsChart3.ordinal()];
        float fMo5016toPx0680j_42 = i != 1 ? i != 2 ? Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(4)) : Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1)) : 0.0f;
        if (!immutableList.isEmpty()) {
            fMo5016toPx0680j_4 = (returnsChart3 == ReturnsChart3.SHORT || returnsChart3 == ReturnsChart3.MEDIUM) ? Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1)) : returnsChart3 == ReturnsChart3.TALL ? Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2)) : 0.0f;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, RoundRect2.m6573RoundRectsniSvfs(new Rect(f, f4, f10, f3), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_42) << 32))), null, 2, null);
        float f11 = f3 - f4;
        float f12 = 1;
        float f13 = (f12 - 0.96f) * f11;
        float f14 = f13 + f4;
        float f15 = f3 - f13;
        float f16 = 2;
        float f17 = (f11 * (f12 - 1.0f)) / f16;
        float f18 = fMo5016toPx0680j_4 / f16;
        float f19 = (f17 + f4) - f18;
        float f20 = (f3 + f18) - f17;
        Path Path2 = AndroidPath_androidKt.Path();
        float f21 = f + fMo5016toPx0680j_42;
        Path2.moveTo(f21, f19);
        float f22 = f19 + fMo5016toPx0680j_42;
        float f23 = fMo5016toPx0680j_4;
        Path2.quadraticTo(0.0f, f22, 0.0f, f14);
        Path2.lineTo(0.0f, f15);
        float f24 = f20 - fMo5016toPx0680j_42;
        Path2.quadraticTo(0.0f, f24, f21, f20);
        Path2.close();
        float f25 = f10 + f5;
        Path Path3 = AndroidPath_androidKt.Path();
        float f26 = f10 - fMo5016toPx0680j_42;
        Path3.moveTo(f26, f19);
        Path3.quadraticTo(f25, f22, f25, f14);
        Path3.lineTo(f25, f15);
        Path3.quadraticTo(f25, f24, f26, f20);
        Path3.close();
        if (immutableList2.isEmpty()) {
            path = Path3;
            f9 = 1.0f;
        } else {
            path = Path3;
            f9 = 1.0f;
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, Path2, Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, immutableList2, f6, f7, 0, 8, (Object) null), 0.0f, null, null, 0, 60, null);
        }
        if (!immutableList3.isEmpty()) {
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, path, Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, immutableList3, f6, f7, 0, 8, (Object) null), 0.0f, null, null, 0, 60, null);
        }
        if (!immutableList4.isEmpty()) {
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, Path, Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, immutableList4, f6, f7, 0, 8, (Object) null), 0.0f, null, null, 0, 60, null);
        }
        if (!immutableList.isEmpty()) {
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, Path, Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, immutableList, f6, f7, 0, 8, (Object) null), 0.0f, new Stroke(f23, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        }
        int iM6700getIntersectrtfAjoo = ClipOp.INSTANCE.m6700getIntersectrtfAjoo();
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6938clipPathmtrdDE(Path, iM6700getIntersectrtfAjoo);
            float fCoerceAtLeast = RangesKt.coerceAtLeast((f10 - f) * 0.1f, f9);
            Brush.Companion companion2 = Brush.INSTANCE;
            Color colorM6701boximpl = Color.m6701boximpl(j);
            Color.Companion companion3 = Color.INSTANCE;
            Brush brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU())}), f6, f6 + fCoerceAtLeast, 0, 8, (Object) null);
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
            long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fCoerceAtLeast) & 4294967295L) | (Float.floatToRawIntBits(r0) << 32));
            BlendMode.Companion companion4 = BlendMode.INSTANCE;
            DrawScope.m6957drawRectAsUm42w$default(Canvas, brushM6682verticalGradient8A3gB4$default, jM6535constructorimpl, jM6575constructorimpl, 0.0f, null, null, companion4.m6670getSrcOver0nO6VwU(), 56, null);
            DrawScope.m6957drawRectAsUm42w$default(Canvas, Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU()), Color.m6701boximpl(j)}), f7 - fCoerceAtLeast, f7, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(r28) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(fCoerceAtLeast) & 4294967295L)), 0.0f, null, null, companion4.m6670getSrcOver0nO6VwU(), 56, null);
            try {
                float f27 = f7 - f6;
                j2 = jMo6936getSizeNHjbRc;
                try {
                    DrawScope.m6957drawRectAsUm42w$default(Canvas, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(j), Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU())}), f, f + fCoerceAtLeast, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fCoerceAtLeast) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L)), 0.0f, null, null, companion4.m6670getSrcOver0nO6VwU(), 56, null);
                    DrawScope.m6957drawRectAsUm42w$default(Canvas, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU()), Color.m6701boximpl(j)}), f10 - fCoerceAtLeast, f10, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(r13) << 32)), Size.m6575constructorimpl((Float.floatToRawIntBits(fCoerceAtLeast) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L)), 0.0f, null, null, companion4.m6670getSrcOver0nO6VwU(), 56, null);
                    if (color != null) {
                        float f28 = f8 * 0.1f;
                        Path Path4 = AndroidPath_androidKt.Path();
                        float f29 = 5;
                        Path4.moveTo(f + Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f29)), Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f29)) + f4);
                        float f30 = 8;
                        Path4.lineTo(f + Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f30)), Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f29)) + f4 + f28);
                        Path4.lineTo(f10 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f30)), Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f29)) + f4 + f28);
                        Path4.lineTo(f10 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f29)), Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f29)) + f4);
                        Path4.close();
                        Brush brushM6682verticalGradient8A3gB4$default2 = Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{color, Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU())}), Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f29)) + f4, Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f29)) + f4 + f28, 0, 8, (Object) null);
                        companion = companion2;
                        DrawScope.m6954drawPathGBMwjPU$default(Canvas, Path4, brushM6682verticalGradient8A3gB4$default2, 0.0f, null, null, 0, 60, null);
                    } else {
                        companion = companion2;
                    }
                    if (color2 != null) {
                        float f31 = f8 * 0.1f;
                        Path Path5 = AndroidPath_androidKt.Path();
                        float f32 = 5;
                        Path5.moveTo(f + Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f32)), f3 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f32)));
                        float f33 = 8;
                        Path5.lineTo(f + Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f33)), (f3 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f32))) - f31);
                        Path5.lineTo(f10 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f33)), (f3 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f32))) - f31);
                        Path5.lineTo(f10 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f32)), f3 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f32)));
                        Path5.close();
                        DrawScope.m6954drawPathGBMwjPU$default(Canvas, Path5, Brush.Companion.m6682verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU()), color2}), (f3 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f32))) - f31, f3 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f32)), 0, 8, (Object) null), 0.0f, null, null, 0, 60, null);
                    }
                    drawContext.getCanvas().restore();
                    drawContext.mo6937setSizeuvyYCjk(j2);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    drawContext.getCanvas().restore();
                    drawContext.mo6937setSizeuvyYCjk(j2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j2 = jMo6936getSizeNHjbRc;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = jMo6936getSizeNHjbRc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ReturnsBar_KCtd2fs$lambda$30$lambda$25$lambda$24(float f, float f2, float f3, MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(constraints.getValue());
        final int i = (int) f;
        final int height = (int) ((f2 - f3) - placeableMo7239measureBRTryo0.getHeight());
        return MeasureScope.layout$default(layout, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReturnsChart7.ReturnsBar_KCtd2fs$lambda$30$lambda$25$lambda$24$lambda$23(placeableMo7239measureBRTryo0, i, height, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBar_KCtd2fs$lambda$30$lambda$25$lambda$24$lambda$23(Placeable placeable, int i, int i2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, placeable, i, i2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBar_KCtd2fs$lambda$30$lambda$27$lambda$26(Animatable animatable, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(((Number) animatable.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBarChart$lambda$33$lambda$32(int i) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReturnsBarChart(final ImmutableList<ReturnsBarData> bars, Modifier modifier, boolean z, Function1<? super Integer, Unit> function1, ReturnsChart4 returnsChart4, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        Function1<? super Integer, Unit> function12;
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean isDay;
        Object objRememberedValue;
        long jM21426getFg20d7_KjU;
        final Modifier modifier3;
        Composer composer2;
        final boolean z5;
        final Function1<? super Integer, Unit> function13;
        final ReturnsChart4 returnsChart42;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bars, "bars");
        Composer composerStartRestartGroup = composer.startRestartGroup(1269559130);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(bars) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changed(returnsChart4 == null ? -1 : returnsChart4.ordinal()) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((196608 & i) == 0) {
                            z4 = z2;
                            i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                        i8 = i3;
                        if ((74899 & i8) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if (i5 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ReturnsChart7.ReturnsBarChart$lambda$33$lambda$32(((Integer) obj).intValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function12 = (Function1) objRememberedValue2;
                            }
                            ReturnsChart4 returnsChart43 = i6 == 0 ? ReturnsChart4.INTRO : returnsChart4;
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1269559130, i8, -1, "com.robinhood.android.advisory.returns.ReturnsBarChart (ReturnsChart.kt:568)");
                            }
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            isDay = bentoTheme.getColors(composerStartRestartGroup, i10).getIsDay();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotIntState3.mutableIntStateOf(-1);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            if (isDay) {
                                composerStartRestartGroup.startReplaceGroup(275629213);
                                jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21426getFg20d7_KjU();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(275628349);
                                jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21427getFg30d7_KjU();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ReturnsChart4 returnsChart44 = returnsChart43;
                            Function1<? super Integer, Unit> function14 = function12;
                            boolean z6 = z4;
                            boolean z7 = z3;
                            z4 = z6;
                            Modifier modifier5 = modifier4;
                            BoxWithConstraints.BoxWithConstraints(modifier5, null, false, ComposableLambda3.rememberComposableLambda(-1333052732, true, new C93402(density, bars, bentoTheme.getTypography(composerStartRestartGroup, i10).getTextS(), z6, jM21426getFg20d7_KjU, TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1), z7, isDay, function14, returnsChart44, snapshotIntState2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i8 >> 3) & 14) | 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            composer2 = composerStartRestartGroup;
                            z5 = z7;
                            function13 = function14;
                            returnsChart42 = returnsChart44;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            returnsChart42 = returnsChart4;
                            modifier3 = modifier2;
                            z5 = z3;
                            function13 = function12;
                            composer2 = composerStartRestartGroup;
                        }
                        final boolean z8 = z4;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.returns.ReturnsChartKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ReturnsChart7.ReturnsBarChart$lambda$37(bars, modifier3, z5, function13, returnsChart42, z8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    z4 = z2;
                    i8 = i3;
                    if ((74899 & i8) != 74898) {
                        if (i9 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i102 = BentoTheme.$stable;
                        isDay = bentoTheme2.getColors(composerStartRestartGroup, i102).getIsDay();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        if (isDay) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ReturnsChart4 returnsChart442 = returnsChart43;
                        Function1<? super Integer, Unit> function142 = function12;
                        boolean z62 = z4;
                        boolean z72 = z3;
                        z4 = z62;
                        Modifier modifier52 = modifier4;
                        BoxWithConstraints.BoxWithConstraints(modifier52, null, false, ComposableLambda3.rememberComposableLambda(-1333052732, true, new C93402(density2, bars, bentoTheme2.getTypography(composerStartRestartGroup, i102).getTextS(), z62, jM21426getFg20d7_KjU, TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1), z72, isDay, function142, returnsChart442, snapshotIntState22), composerStartRestartGroup, 54), composerStartRestartGroup, ((i8 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        composer2 = composerStartRestartGroup;
                        z5 = z72;
                        function13 = function142;
                        returnsChart42 = returnsChart442;
                    }
                    final boolean z82 = z4;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                z4 = z2;
                i8 = i3;
                if ((74899 & i8) != 74898) {
                }
                final boolean z822 = z4;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function12 = function1;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z4 = z2;
            i8 = i3;
            if ((74899 & i8) != 74898) {
            }
            final boolean z8222 = z4;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z4 = z2;
        i8 = i3;
        if ((74899 & i8) != 74898) {
        }
        final boolean z82222 = z4;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
