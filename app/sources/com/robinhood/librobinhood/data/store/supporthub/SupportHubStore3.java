package com.robinhood.librobinhood.data.store.supporthub;

import com.robinhood.models.p355ui.supporthub.RecommendedActions;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: SupportHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/supporthub/RecommendedActions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$recommendedActionsEndpoint$2", m3645f = "SupportHubStore.kt", m3646l = {46}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$recommendedActionsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SupportHubStore3 extends ContinuationImpl7 implements Function2<RecommendedActions, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportHubStore3(SupportHubStore supportHubStore, Continuation<? super SupportHubStore3> continuation) {
        super(2, continuation);
        this.this$0 = supportHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportHubStore3 supportHubStore3 = new SupportHubStore3(this.this$0, continuation);
        supportHubStore3.L$0 = obj;
        return supportHubStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecommendedActions recommendedActions, Continuation<? super Unit> continuation) {
        return ((SupportHubStore3) create(recommendedActions, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RecommendedActions recommendedActions = (RecommendedActions) this.L$0;
            StateFlow2 stateFlow2 = this.this$0.recommendedActionsFlow;
            this.label = 1;
            if (stateFlow2.emit(recommendedActions, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
