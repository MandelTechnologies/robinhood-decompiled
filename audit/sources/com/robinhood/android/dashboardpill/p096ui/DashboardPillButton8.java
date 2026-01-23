package com.robinhood.android.dashboardpill.p096ui;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.dashboardpill.DashboardPillData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: DashboardPillButton.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$PillButtonComposable$2$1", m3645f = "DashboardPillButton.kt", m3646l = {680}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$PillButtonComposable$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardPillButton8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clock $clock;
    final /* synthetic */ SnapshotState<Boolean> $isCountdownComplete$delegate;
    final /* synthetic */ DashboardPillData $pillData;
    final /* synthetic */ SnapshotState<Duration> $remainingDuration$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardPillButton8(Clock clock, DashboardPillData dashboardPillData, SnapshotState<Duration> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super DashboardPillButton8> continuation) {
        super(2, continuation);
        this.$clock = clock;
        this.$pillData = dashboardPillData;
        this.$remainingDuration$delegate = snapshotState;
        this.$isCountdownComplete$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardPillButton8(this.$clock, this.$pillData, this.$remainingDuration$delegate, this.$isCountdownComplete$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardPillButton8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            Instant instant = this.$clock.instant();
            if (instant.isBefore(this.$pillData.getTargetTimestamp())) {
                this.$remainingDuration$delegate.setValue(Duration.between(instant, this.$pillData.getTargetTimestamp()));
                DashboardPillButton5.PillButtonComposable_FU0evQE$lambda$35(this.$isCountdownComplete$delegate, false);
            } else {
                this.$remainingDuration$delegate.setValue(Duration.ZERO);
                DashboardPillButton5.PillButtonComposable_FU0evQE$lambda$35(this.$isCountdownComplete$delegate, true);
            }
            this.label = 1;
        } while (DelayKt.delay(100L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
