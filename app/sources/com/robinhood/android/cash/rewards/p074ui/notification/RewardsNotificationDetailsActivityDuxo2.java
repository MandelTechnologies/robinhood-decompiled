package com.robinhood.android.cash.rewards.p074ui.notification;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RewardsNotificationDetailsActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsActivityDuxo$onStart$2$1", m3645f = "RewardsNotificationDetailsActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsActivityDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RewardsNotificationDetailsActivityDuxo2 extends ContinuationImpl7 implements Function2<RewardsNotificationDetailsActivityViewState, Continuation<? super RewardsNotificationDetailsActivityViewState>, Object> {
    final /* synthetic */ Boolean $hasBonus;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsNotificationDetailsActivityDuxo2(Boolean bool, Continuation<? super RewardsNotificationDetailsActivityDuxo2> continuation) {
        super(2, continuation);
        this.$hasBonus = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RewardsNotificationDetailsActivityDuxo2 rewardsNotificationDetailsActivityDuxo2 = new RewardsNotificationDetailsActivityDuxo2(this.$hasBonus, continuation);
        rewardsNotificationDetailsActivityDuxo2.L$0 = obj;
        return rewardsNotificationDetailsActivityDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RewardsNotificationDetailsActivityViewState rewardsNotificationDetailsActivityViewState, Continuation<? super RewardsNotificationDetailsActivityViewState> continuation) {
        return ((RewardsNotificationDetailsActivityDuxo2) create(rewardsNotificationDetailsActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RewardsNotificationDetailsActivityViewState) this.L$0).copy(this.$hasBonus);
    }
}
