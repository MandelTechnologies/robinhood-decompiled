package com.robinhood.android.dashboardpill.p096ui;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DashboardPillButton.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$DashboardPillButton$2$1", m3645f = "DashboardPillButton.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$DashboardPillButton$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardPillButton6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLottieLoading;
    final /* synthetic */ SnapshotState<Boolean> $shouldFadeIn$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardPillButton6(boolean z, SnapshotState<Boolean> snapshotState, Continuation<? super DashboardPillButton6> continuation) {
        super(2, continuation);
        this.$isLottieLoading = z;
        this.$shouldFadeIn$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardPillButton6(this.$isLottieLoading, this.$shouldFadeIn$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardPillButton6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$isLottieLoading && DashboardPillButton5.DashboardPillButton$lambda$3(this.$shouldFadeIn$delegate)) {
            DashboardPillButton5.DashboardPillButton$lambda$4(this.$shouldFadeIn$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
