package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.PathfinderApi;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;

/* compiled from: PathfinderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/pathfinder/UserViewState;", "it", "Lcom/robinhood/librobinhood/data/store/UserViewInputRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$postUserViewInputEndpoint$1", m3645f = "PathfinderStore.kt", m3646l = {69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$postUserViewInputEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PathfinderStore2 extends ContinuationImpl7 implements Function2<UserViewInputRequest, Continuation<? super UserViewState>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PathfinderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathfinderStore2(PathfinderStore pathfinderStore, Continuation<? super PathfinderStore2> continuation) {
        super(2, continuation);
        this.this$0 = pathfinderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PathfinderStore2 pathfinderStore2 = new PathfinderStore2(this.this$0, continuation);
        pathfinderStore2.L$0 = obj;
        return pathfinderStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UserViewInputRequest userViewInputRequest, Continuation<? super UserViewState> continuation) {
        return ((PathfinderStore2) create(userViewInputRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UserViewInputRequest userViewInputRequest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserViewInputRequest userViewInputRequest2 = (UserViewInputRequest) this.L$0;
            PathfinderApi pathfinderApi = this.this$0.pathfinderApi;
            UUID inquiryId = userViewInputRequest2.getInquiryId();
            com.robinhood.models.api.pathfinder.UserViewInputRequest body = userViewInputRequest2.getBody();
            this.L$0 = userViewInputRequest2;
            this.label = 1;
            Object objSendUserViewInput = pathfinderApi.sendUserViewInput(inquiryId, body, this);
            if (objSendUserViewInput == coroutine_suspended) {
                return coroutine_suspended;
            }
            userViewInputRequest = userViewInputRequest2;
            obj = objSendUserViewInput;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userViewInputRequest = (UserViewInputRequest) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return PathfinderStores2.toUiModel((ResponseBody) obj, userViewInputRequest.getInquiryId(), this.this$0.getUserViewStateAdapter(), this.this$0.getPartialUserViewStateAdapter(), this.this$0.eventLogger);
    }
}
