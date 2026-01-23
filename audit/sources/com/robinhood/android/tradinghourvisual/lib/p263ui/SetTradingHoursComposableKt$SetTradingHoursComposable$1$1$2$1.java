package com.robinhood.android.tradinghourvisual.lib.p263ui;

import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SetTradingHoursComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$2$1 implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ Density $density;
    final /* synthetic */ SnapshotState<C2002Dp> $leftTextColumnWidth;

    SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$2$1(SnapshotState<C2002Dp> snapshotState, Density density) {
        this.$leftTextColumnWidth = snapshotState;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$leftTextColumnWidth.setValue(C2002Dp.m7993boximpl(this.$density.mo5013toDpu2uoSUM((int) (it.mo7241getSizeYbymL2g() >> 32))));
    }
}
