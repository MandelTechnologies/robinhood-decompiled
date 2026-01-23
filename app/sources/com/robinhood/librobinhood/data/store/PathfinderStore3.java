package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p355ui.pathfinder.UserViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: PathfinderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/UserViewInputRequest;", "viewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$postUserViewInputEndpoint$2", m3645f = "PathfinderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$postUserViewInputEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PathfinderStore3 extends ContinuationImpl7 implements Function3<UserViewInputRequest, UserViewState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PathfinderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathfinderStore3(PathfinderStore pathfinderStore, Continuation<? super PathfinderStore3> continuation) {
        super(3, continuation);
        this.this$0 = pathfinderStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(UserViewInputRequest userViewInputRequest, UserViewState userViewState, Continuation<? super Unit> continuation) {
        PathfinderStore3 pathfinderStore3 = new PathfinderStore3(this.this$0, continuation);
        pathfinderStore3.L$0 = userViewInputRequest;
        pathfinderStore3.L$1 = userViewState;
        return pathfinderStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UserViewInputRequest userViewInputRequest = (UserViewInputRequest) this.L$0;
        this.this$0.acceptNewState(userViewInputRequest.getInquiryId(), (UserViewState) this.L$1);
        return Unit.INSTANCE;
    }
}
