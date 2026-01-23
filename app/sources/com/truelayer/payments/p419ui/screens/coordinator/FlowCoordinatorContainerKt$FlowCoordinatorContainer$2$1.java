package com.truelayer.payments.p419ui.screens.coordinator;

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

/* compiled from: FlowCoordinatorContainer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$2$1", m3645f = "FlowCoordinatorContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FlowCoordinatorContainerKt$FlowCoordinatorContainer$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCoordinatorActions $actions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowCoordinatorContainerKt$FlowCoordinatorContainer$2$1(FlowCoordinatorActions flowCoordinatorActions, Continuation<? super FlowCoordinatorContainerKt$FlowCoordinatorContainer$2$1> continuation) {
        super(2, continuation);
        this.$actions = flowCoordinatorActions;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowCoordinatorContainerKt$FlowCoordinatorContainer$2$1(this.$actions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlowCoordinatorContainerKt$FlowCoordinatorContainer$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$actions.getOnInit().invoke(boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
