package com.robinhood.android.cash.rhy.tab.p077v2.onboarding;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyUpgradeSuvShimActivity.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$startSuvPrecheck$4$1", m3645f = "RhyUpgradeSuvShimActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyUpgradeSuvShimActivity$startSuvPrecheck$4$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RhyUpgradeSuvShimActivity2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isMigrated;
    final /* synthetic */ UUID $workflowId;
    int label;
    final /* synthetic */ RhyUpgradeSuvShimActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyUpgradeSuvShimActivity2(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity, UUID uuid, boolean z, Continuation<? super RhyUpgradeSuvShimActivity2> continuation) {
        super(2, continuation);
        this.this$0 = rhyUpgradeSuvShimActivity;
        this.$workflowId = uuid;
        this.$isMigrated = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyUpgradeSuvShimActivity2(this.this$0, this.$workflowId, this.$isMigrated, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RhyUpgradeSuvShimActivity2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.launchSuv.invoke(this.$workflowId, boxing.boxBoolean(this.$isMigrated));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
