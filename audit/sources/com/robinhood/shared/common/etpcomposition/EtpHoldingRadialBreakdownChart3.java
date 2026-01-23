package com.robinhood.shared.common.etpcomposition;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EtpHoldingRadialBreakdownChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$RadialChartContent$2$1, reason: use source file name */
/* loaded from: classes26.dex */
final class EtpHoldingRadialBreakdownChart3 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<Size> $chartSize$delegate;
    final /* synthetic */ float $degreesPerTick;
    final /* synthetic */ ImmutableList<Integer> $holdingTickCounts;
    final /* synthetic */ ImmutableList<EtpHolding> $holdings;
    final /* synthetic */ Function1<EtpHolding, Unit> $onHoldingSelected;
    final /* synthetic */ ImmutableList<Integer> $startTicks;
    final /* synthetic */ float $thicknessRatio;

    /* JADX WARN: Multi-variable type inference failed */
    EtpHoldingRadialBreakdownChart3(float f, float f2, ImmutableList<EtpHolding> immutableList, ImmutableList<Integer> immutableList2, ImmutableList<Integer> immutableList3, Function1<? super EtpHolding, Unit> function1, SnapshotState<Size> snapshotState) {
        this.$thicknessRatio = f;
        this.$degreesPerTick = f2;
        this.$holdings = immutableList;
        this.$startTicks = immutableList2;
        this.$holdingTickCounts = immutableList3;
        this.$onHoldingSelected = function1;
        this.$chartSize$delegate = snapshotState;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final float f = this.$thicknessRatio;
        final float f2 = this.$degreesPerTick;
        final ImmutableList<EtpHolding> immutableList = this.$holdings;
        final ImmutableList<Integer> immutableList2 = this.$startTicks;
        final ImmutableList<Integer> immutableList3 = this.$holdingTickCounts;
        final Function1<EtpHolding, Unit> function1 = this.$onHoldingSelected;
        final SnapshotState<Size> snapshotState = this.$chartSize$delegate;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$RadialChartContent$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpHoldingRadialBreakdownChart3.invoke$lambda$0(f, f2, immutableList, immutableList2, immutableList3, function1, snapshotState, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$0(float f, float f2, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Function1 function1, SnapshotState snapshotState, Offset offset) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (EtpHoldingRadialBreakdownChart.RadialChartContent_ZZF9Tkg$lambda$19(snapshotState) >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (EtpHoldingRadialBreakdownChart.RadialChartContent_ZZF9Tkg$lambda$19(snapshotState) & 4294967295L));
        if (fIntBitsToFloat <= 0.0f || fIntBitsToFloat2 <= 0.0f) {
            return Unit.INSTANCE;
        }
        float fCoerceAtMost = RangesKt.coerceAtMost(fIntBitsToFloat, fIntBitsToFloat2);
        float f3 = fCoerceAtMost / 2.0f;
        float f4 = f3 - (fCoerceAtMost * f);
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2 / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat / 2.0f) << 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (offset.getPackedValue() >> 32)) - Float.intBitsToFloat((int) (jM6535constructorimpl >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (offset.getPackedValue() & 4294967295L)) - Float.intBitsToFloat((int) (jM6535constructorimpl & 4294967295L));
        float fSqrt = (float) Math.sqrt((fIntBitsToFloat3 * fIntBitsToFloat3) + (fIntBitsToFloat4 * fIntBitsToFloat4));
        if (fSqrt >= f4 - 20.0f && fSqrt <= f3 + 20.0f) {
            float degrees = (float) Math.toDegrees((float) Math.atan2(fIntBitsToFloat4, fIntBitsToFloat3));
            if (degrees < 0.0f) {
                degrees += 360.0f;
            }
            int i = (int) (((degrees + 90.0f) % 360.0f) / f2);
            int size = immutableList.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iIntValue = ((Number) immutableList2.get(i2)).intValue();
                int iIntValue2 = ((Number) immutableList3.get(i2)).intValue() + iIntValue;
                if (iIntValue <= i && i < iIntValue2) {
                    function1.invoke(immutableList.get(i2));
                    return Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
