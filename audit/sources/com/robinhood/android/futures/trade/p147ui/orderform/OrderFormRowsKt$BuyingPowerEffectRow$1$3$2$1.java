package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderFormRows.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class OrderFormRowsKt$BuyingPowerEffectRow$1$3$2$1 implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ SnapshotState<Offset> $goldSavingsLabelPositionInWindow$delegate;

    OrderFormRowsKt$BuyingPowerEffectRow$1$3$2$1(SnapshotState<Offset> snapshotState) {
        this.$goldSavingsLabelPositionInWindow$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        OrderFormRowsKt.BuyingPowerEffectRow$lambda$38$lambda$31(this.$goldSavingsLabelPositionInWindow$delegate, LayoutCoordinates2.positionInWindow(layoutCoordinates));
    }
}
