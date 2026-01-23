package com.robinhood.shared.common.earnings;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: EarningsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$2$1$4$1, reason: use source file name */
/* loaded from: classes26.dex */
final class EarningsComposable4 implements Function1<ScrubState, Unit> {
    final /* synthetic */ SnapshotState<ScrubState> $scrubState$delegate;

    EarningsComposable4(SnapshotState<ScrubState> snapshotState) {
        this.$scrubState$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScrubState scrubState) {
        invoke2(scrubState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScrubState scrubState) {
        this.$scrubState$delegate.setValue(scrubState);
    }
}
