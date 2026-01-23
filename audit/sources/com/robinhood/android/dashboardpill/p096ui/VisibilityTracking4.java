package com.robinhood.android.dashboardpill.p096ui;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.dashboardpill.DashboardPillData2;
import com.robinhood.android.dashboardpill.DashboardPillManager;
import com.robinhood.android.dashboardpill.p096ui.VisibilityTracking2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: VisibilityTracking.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt$trackDashboardPillVisibility$1$2$1", m3645f = "VisibilityTracking.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt$trackDashboardPillVisibility$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class VisibilityTracking4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isComposed$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isLifecycleStarted$delegate;
    final /* synthetic */ DashboardPillData2 $location;
    final /* synthetic */ DashboardPillManager $manager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VisibilityTracking4(DashboardPillManager dashboardPillManager, DashboardPillData2 dashboardPillData2, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super VisibilityTracking4> continuation) {
        super(2, continuation);
        this.$manager = dashboardPillManager;
        this.$location = dashboardPillData2;
        this.$isComposed$delegate = snapshotState;
        this.$isLifecycleStarted$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VisibilityTracking4(this.$manager, this.$location, this.$isComposed$delegate, this.$isLifecycleStarted$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VisibilityTracking4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$manager.setVisibleLocation(VisibilityTracking2.C138271.invoke$lambda$1(this.$isComposed$delegate) && VisibilityTracking2.C138271.invoke$lambda$4(this.$isLifecycleStarted$delegate) ? this.$location : null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
